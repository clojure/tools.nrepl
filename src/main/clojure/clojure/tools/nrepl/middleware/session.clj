
(ns ^{:doc "Support for persistent, cross-connection REPL sessions."
      :author "Chas Emerick"}
     clojure.tools.nrepl.middleware.session
  (:use [clojure.tools.nrepl.misc :only (uuid response-for returning log)]
        [clojure.tools.nrepl.middleware.interruptible-eval :only (*msg*)]
        [clojure.tools.nrepl.middleware :only (set-descriptor!)])
  (:require (clojure main test)
            [clojure.tools.nrepl.transport :as t])
  (:import clojure.tools.nrepl.transport.Transport
           (java.io PipedReader PipedWriter Reader Writer PrintWriter StringReader)
           clojure.lang.LineNumberingPushbackReader))

(def ^{:private true} sessions (atom {}))

;; TODO the way this is currently, :out and :err will continue to be
;; associated with a particular *msg* (and session) even when produced from a future,
;; agent, etc. due to binding conveyance.  This may or may not be desirable
;; depending upon the expectations of the client/user.  I'm not sure at the moment
;; how best to make it configurable though...

(def ^{:dynamic true :private true} *out-limit* 1024)

(defn- session-out
  "Returns a PrintWriter suitable for binding as *out* or *err*.  All of
   the content written to that PrintWriter will (when .flush-ed) be sent on the
   given transport in messages specifying the given session-id.
   `channel-type` should be :out or :err, as appropriate."
  [channel-type session-id transport]
  (let [buf (clojure.tools.nrepl.StdOutBuffer.)]
    (PrintWriter. (proxy [Writer] []
                    (close [] (.flush ^Writer this))
                    (write [& [x ^Integer off ^Integer len]]
                      (locking buf
                        (cond
                          (number? x) (.append buf (char x))
                          (not off) (.append buf x)
                          ; the CharSequence overload of append takes an *end* idx, not length!
                          (instance? CharSequence x) (.append buf ^CharSequence x off (+ len off))
                          :else (.append buf ^chars x off len))
                        (when (<= *out-limit* (.length buf))
                          (.flush ^Writer this))))
                    (flush []
                      (let [text (locking buf (let [text (str buf)]
                                                (.setLength buf 0)
                                                text))]
                        (when (pos? (count text))
                          (t/send (or (:transport *msg*) transport)
                                  (response-for *msg* :session session-id
                                                channel-type text))))))
                  true)))

(defn- session-in
  "Returns a LineNumberingPushbackReader suitable for binding to *in*.
   When something attempts to read from it, it will (if empty) send a
   {:status :need-input} message on the provided transport so the client/user
   can provide content to be read."
  [session-id transport]
  (let [request-input (fn [^PipedReader r]
                        (when-not (.ready r)
                          (t/send transport
                            (response-for *msg* :session session-id
                                                :status :need-input))))
        writer (PipedWriter.)
        reader (LineNumberingPushbackReader.
                 (proxy [PipedReader] [writer]
                   (close [])
                   (read
                     ([] (request-input this)
                         (let [^Reader this this] (proxy-super read)))
                     ([x] (request-input this)
                          (let [^Reader this this]
                            (if (instance? java.nio.CharBuffer x)
                              (proxy-super read ^java.nio.CharBuffer x)
                              (proxy-super read ^chars x))))
                     ([buf off len]
                       (let [^Reader this this]
                         (request-input this)
                         (proxy-super read buf off len))))))]
    [reader writer]))

(defn- create-session
  "Returns a new atom containing a map of bindings as per
   `clojure.core/get-thread-bindings`.  Values for *out*, *err*, and *in*
   are obtained using `session-in` and `session-out`, *ns* is specified by
   ns (a symbol), and other bindings as optionally provided in
  `baseline-bindings`are merged in."
  ([transport ns] (create-session transport ns {}))
  ([transport ns baseline-bindings]
    (clojure.main/with-bindings
      (let [id (uuid)
            out (session-out :out id transport)
            [in in-writer] (session-in id transport)]
        (binding [*out* out
                  *err* (session-out :err id transport)
                  *in* in
                  *ns* (create-ns ns)
                  *out-limit* (or (baseline-bindings #'*out-limit*) 1024)
                  ; clojure.test captures *out* at load-time, so we need to make sure
                  ; runtime output of test status/results is redirected properly
                  ; TODO is this something we need to consider in general, or is this
                  ; specific hack reasonable?
                  clojure.test/*test-out* out]
          ; nrepl.server happens to use agents for connection dispatch
          ; don't capture that *agent* binding for userland REPL sessions
          (atom (merge baseline-bindings (dissoc (get-thread-bindings) #'*agent*))
            :meta {:id id
                   :stdin-reader in
                   :stdin-writer in-writer}))))))

(defn- register-session
  "Registers a new session containing the baseline bindings contained in the
   given message's :session. The new session's *ns* binding is specified by
   ns (as a symbol)."
  [{:keys [session transport] :as msg} ns]
  (let [session (create-session transport ns @session)
        id (-> session meta :id)]
    (swap! sessions assoc id session)
    (t/send transport (response-for msg :status :done :new-session id))))

(defn- close-session
  "Drops the session associated with the given message."
  [{:keys [session transport] :as msg}]
  (swap! sessions dissoc (-> session meta :id))
  (t/send transport (response-for msg :status #{:done :session-closed})))

(defn session
  "Session middleware.  Returns a handler which supports these :op-erations:

   * \"ls-sessions\", which results in a response message
     containing a list of the IDs of the currently-retained sessions in a
     :session slot.
   * \"close\", which drops the session indicated by the
     ID in the :session slot.  The response message's :status will include
     :session-closed.
   * \"clone\", which will cause a new session to be retained.  The ID of this
     new session will be returned in a response message in a :new-session
     slot.  The new session's state (dynamic scope, etc) will be a copy of
     the state of the session identified in the :session slot of the request.

   Messages indicating other operations are delegated to the given handler,
   with the session identified by the :session ID added to the message. If
   no :session ID is found, a new session is created (which will only
   persist for the duration of the handling of the given message).

   Requires the interruptible-eval middleware (specifically, its binding of
   *msg* to the currently-evaluated message so that session-specific *out*
   and *err* content can be associated with the originating message).

   Accepts an optional named argument :init-ns (a symbol), which specifies
   the initial *ns* binding for the session. The default value is 'user."
  [h & {:keys [init-ns] :or {init-ns 'user}}]
  (fn [{:keys [op session transport out-limit] :as msg}]
    (let [the-session (if session
                        (@sessions session)
                        (create-session transport init-ns))]
      (if-not the-session
        (t/send transport (response-for msg :status #{:error :unknown-session}))
        (let [msg (assoc msg :session the-session)]
          ;; TODO yak, this is ugly; need to cleanly thread out-limit through to
          ;; session-out without abusing a dynamic var
          ;; (there's no reason to allow a connected client to fark around with
          ;; a session-out's "buffer")
          (when out-limit (swap! the-session assoc #'*out-limit* out-limit))
          (case op
            "clone" (register-session msg init-ns)
            "close" (close-session msg)
            "ls-sessions" (t/send transport (response-for msg :status :done
                                                              :sessions (or (keys @sessions) [])))
            (h msg)))))))

(set-descriptor! #'session
  {:requires #{}
   :expects #{}
   :handles {"close"
             {:doc "Closes the specified session."
              :requires {"session" "The ID of the session to be closed."}
              :optional {}
              :returns {}}
             "ls-sessions"
             {:doc "Lists the IDs of all active sessions."
              :requires {}
              :optional {}
              :returns {"sessions" "A list of all available session IDs."}}
             "clone"
             {:doc "Clones the current session, returning the ID of the newly-created session."
              :requires {}
              :optional {"session" "The ID of the session to be cloned; if not provided, a new session with default bindings is created, and mapped to the returned session ID."}
              :returns {"new-session" "The ID of the new session."}}}})

(defn add-stdin
  "stdin middleware.  Returns a handler that supports a \"stdin\" :op-eration, which
   adds content provided in a :stdin slot to the session's *in* Reader.  Delegates to
   the given handler for other operations.

   Requires the session middleware."
  [h]
  (fn [{:keys [op stdin session transport] :as msg}]
    (cond
      (= op "eval")
        (let [s (-> session meta ^LineNumberingPushbackReader (:stdin-reader))]
          (when (.ready s)
            (clojure.main/skip-if-eol s))
          (h msg))
      (= op "stdin")
        (do
          (-> session meta ^Writer (:stdin-writer) (.write ^String stdin))
          (t/send transport (response-for msg :status :done)))
      :else
        (h msg))))

(set-descriptor! #'add-stdin
  {:requires #{#'session}
   :expects #{"eval"}
   :handles {"stdin"
             {:doc "Add content from the value of \"stdin\" to *in* in the current session."
              :requires {"stdin" "Content to add to *in*."}
              :optional {}
              :returns {"status" "A status of \"need-input\" will be sent if a session's *in* requires content in order to satisfy an attempted read operation."}}}})
