{:namespaces
 ({:doc "High level nREPL client support.",
   :author "Chas Emerick",
   :name "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj"}
  {:doc nil,
   :name "clojure.tools.nrepl.ack",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.ack-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b67830799d58919da3f193126b6c6d20ab4642c0/src/main/clojure/clojure/tools/nrepl/ack.clj"}
  {:doc "A netstring and bencode implementation for Clojure.",
   :author "Meikel Brandmeyer",
   :name "clojure.tools.nrepl.bencode",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.bencode-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:doc
   "A proof-of-concept command-line client for nREPL.  Please see\ne.g. reply for a proper command-line nREPL client @\nhttps://github.com/trptcolin/reply/",
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.cmdline",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.cmdline-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b67830799d58919da3f193126b6c6d20ab4642c0/src/main/clojure/clojure/tools/nrepl/cmdline.clj"}
  {:doc nil,
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.helpers",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.helpers-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/helpers.clj"}
  {:doc nil,
   :name "clojure.tools.nrepl.middleware",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/aaba304066736f4911d76270dc3a83edab38fca0/src/main/clojure/clojure/tools/nrepl/middleware.clj"}
  {:doc nil,
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.interruptible-eval-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj"}
  {:doc nil,
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.middleware.load-file",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.load-file-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2263b6b019aa75462a42cc765357f2cecff5ef23/src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj"}
  {:doc nil,
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.middleware.pr-values",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.pr-values-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/d1613c99a07a64b55fbaed5806596463c1ad2f53/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj"}
  {:doc "Support for persistent, cross-connection REPL sessions.",
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.middleware.session",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.session-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/f95f2be94c2e43e61f8b7464978216787194490d/src/main/clojure/clojure/tools/nrepl/middleware/session.clj"}
  {:doc
   "Misc utilities used in nREPL's implementation (potentially also useful\nfor anyone extending it).",
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.misc",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.misc-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj"}
  {:doc "Default server implementations",
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.server-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj"}
  {:doc nil,
   :author "Chas Emerick",
   :name "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.transport-api.html",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "client",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L29",
   :line 29,
   :var-type "function",
   :arglists ([transport response-timeout]),
   :doc
   "Returns a fn of zero and one argument, both of which return the current head of a single\nresponse-seq being read off of the given client-side transport.  The one-arg arity will\nsend a given message on the transport before returning the seq.\n\nMost REPL interactions are best performed via `message` and `client-session` on top of\na client fn returned from this fn.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/client"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "client-session",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L105",
   :line 105,
   :var-type "function",
   :arglists ([client & {:keys [session clone]}]),
   :doc
   "Returns a function of one argument.  Accepts a message that is sent via the\nclient provided with a fixed :session id added to it.  Returns the\nhead of the client's response seq, filtered to include only\nmessages related to the :session id that will terminate when the session is\nclosed.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/client-session"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "code",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L143",
   :line 143,
   :var-type "macro",
   :arglists ([& body]),
   :doc
   "Expands into a string consisting of the macro's body's forms\n(literally, no interpolation/quasiquoting of locals or other\nreferences), suitable for use in an :eval message, e.g.:\n\n{:op :eval, :code (code (+ 1 1) (slurp \"foo.txt\"))}",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/code"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "code*",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L137",
   :line 137,
   :var-type "function",
   :arglists ([& expressions]),
   :doc
   "Returns a single string containing the pr-str'd representations\nof the given expressions.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/code*"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "combine-responses",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L115",
   :line 115,
   :var-type "function",
   :arglists ([responses]),
   :doc
   "Combines the provided seq of response messages into a single response map.\n\nCertain message slots are combined in special ways:\n\n  - only the last :ns is retained\n  - :value is accumulated into an ordered collection\n  - :status and :session are accumulated into a set\n  - string values (associated with e.g. :out and :err) are concatenated",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/combine-responses"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "connect",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L174",
   :line 174,
   :var-type "function",
   :arglists
   ([&
     {:keys [port host transport-fn],
      :or {transport-fn bencode, host "localhost"}}]),
   :doc
   "Connects to a socket-based REPL at the given host (defaults to localhost) and port,\nreturning the Transport (by default clojure.tools.nrepl.transport/bencode)\nfor that connection.\n\nTransports are most easily used with `client`, `client-session`, and\n`message`, depending on the semantics desired.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/connect"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "message",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L86",
   :line 86,
   :var-type "function",
   :arglists ([client {:keys [id], :as msg, :or {id (uuid)}}]),
   :doc
   "Sends a message via [client] with a fixed message :id added to it.\nReturns the head of the client's response seq, filtered to include only\nmessages related to the message :id that will terminate upon receipt of a\n\"done\" :status.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/message"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "new-session",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L95",
   :line 95,
   :var-type "function",
   :arglists ([client & {:keys [clone]}]),
   :doc
   "Provokes the creation and retention of a new session, optionally as a clone\nof an existing retained session, the id of which must be provided as a :clone\nkwarg.  Returns the new session's id.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/new-session"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "read-response-value",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L152",
   :line 152,
   :var-type "function",
   :arglists ([{:keys [value], :as msg}]),
   :doc
   "Returns the provided response message, replacing its :value string with\nthe result of (read)ing it.  Returns the message unchanged if the :value\nslot is empty or not a string.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/read-response-value"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "response-seq",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L19",
   :line 19,
   :var-type "function",
   :arglists ([transport] [transport timeout]),
   :doc
   "Returns a lazy seq of messages received via the given Transport.\nCalled with no further arguments, will block waiting for each message.\nThe seq will end only when the underlying Transport is closed (i.e.\nreturns nil from `recv`) or if a message takes longer than `timeout`\nmillis to arrive.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/response-seq"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "response-values",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L164",
   :line 164,
   :var-type "function",
   :arglists ([responses]),
   :doc
   "Given a seq of responses (as from response-seq or returned from any function returned\nby client or client-session), returns a seq of values read from :value slots found\ntherein.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/response-values"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "url-connect",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L203",
   :line 203,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Connects to an nREPL endpoint identified by the given URL/URI.  Valid\nexamples include:\n\n   nrepl://192.168.0.12:7889\n   telnet://localhost:5000\n   http://your-app-name.heroku.com/repl\n\nThis is a multimethod that dispatches on the scheme of the URI provided\n(which can be a string or java.net.URI).  By default, implementations for\nnrepl (corresponding to using the default bencode transport) and\ntelnet (using the clojure.tools.nrepl.transport/tty transport) are\nregistered.  Alternative implementations may add support for other schemes,\nsuch as HTTP, HTTPS, JMX, existing message queues, etc.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/url-connect"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj",
   :name "version",
   :file "src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/a22aaeec88ed560a728eb7126650a59fcabf8265/src/main/clojure/clojure/tools/nrepl.clj#L237",
   :line 237,
   :var-type "var",
   :arglists nil,
   :doc
   "Current version of nREPL, map of :major, :minor, :incremental, and :qualifier.",
   :namespace "clojure.tools.nrepl",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/version"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b67830799d58919da3f193126b6c6d20ab4642c0/src/main/clojure/clojure/tools/nrepl/ack.clj",
   :name "wait-for-ack",
   :file "src/main/clojure/clojure/tools/nrepl/ack.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b67830799d58919da3f193126b6c6d20ab4642c0/src/main/clojure/clojure/tools/nrepl/ack.clj#L16",
   :line 16,
   :var-type "function",
   :arglists ([timeout]),
   :doc
   "Waits for a presumably just-launched nREPL server to connect and\ndeliver its port number.  Returns that number if it's delivered\nwithin `timeout` ms, otherwise nil.  Assumes that `ack`\nmiddleware has been applied to the local nREPL server handler.\n\nExpected usage:\n\n(reset-ack-port!)\n(start-server already-running-server-port)\n=> (wait-for-ack)\n59872 ; the port of the server started via start-server",
   :namespace "clojure.tools.nrepl.ack",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.ack/wait-for-ack"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :name "read-bencode",
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj#L251",
   :line 251,
   :var-type "function",
   :arglists ([input]),
   :doc "Read bencode token from the input stream.",
   :namespace "clojure.tools.nrepl.bencode",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/read-bencode"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :name "read-netstring",
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj#L157",
   :line 157,
   :var-type "function",
   :arglists ([input]),
   :doc
   "Reads a classic netstring from input—an InputStream. Returns the\ncontained binary data as byte array.",
   :namespace "clojure.tools.nrepl.bencode",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/read-netstring"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :name "write-bencode",
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj#L305",
   :line 305,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Write the given thing to the output stream. “Thing” means here a\nstring, map, sequence or integer. Alternatively an ByteArray may\nbe provided whose contents are written as a bytestring. Similar\nthe contents of a given InputStream are written as a byte string.\nNamed things (symbols or keywords) are written in the form\n'namespace/name'.",
   :namespace "clojure.tools.nrepl.bencode",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/write-bencode"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :name "write-netstring",
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/14d6e683930ba03ef4781cfc5ff6b37e9fbb74cf/src/main/clojure/clojure/tools/nrepl/bencode.clj#L196",
   :line 196,
   :var-type "function",
   :arglists ([output content]),
   :doc
   "Write the given binary data to the output stream in form of a classic\nnetstring.",
   :namespace "clojure.tools.nrepl.bencode",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/write-netstring"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :name "load-file-command",
   :file "src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/helpers.clj#L14",
   :line 14,
   :var-type "function",
   :arglists ([f] [f source-root] [code file-path file-name]),
   :doc
   "(If it is available, sending clojure.tools.nrepl.middleware.load-file\n compatible messages is far preferable.)\n\nReturns a string expression that can be sent to an nREPL session to\nload the Clojure code in given local file in the remote REPL's environment,\npreserving debug information (e.g. line numbers, etc).\n\nTypical usage: (nrepl-client-fn\n                 {:op \"eval\" :code\n                   (load-file-command \"/path/to/clojure/file.clj\")})\n\nIf appropriate, the source path from which the code is being loaded may\nbe provided as well (suitably trimming the file's path to a relative one\nwhen loaded).\n\nThe 3-arg variation of this function expects the full source of the file to be loaded,\nthe source-root-relative path of the source file, and the name of the file.  e.g.:\n\n  (load-file-command \"…code here…\" \"some/ns/name/file.clj\" \"file.clj\")",
   :namespace "clojure.tools.nrepl.helpers",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.helpers/load-file-command"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/aaba304066736f4911d76270dc3a83edab38fca0/src/main/clojure/clojure/tools/nrepl/middleware.clj",
   :name "set-descriptor!",
   :file "src/main/clojure/clojure/tools/nrepl/middleware.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/aaba304066736f4911d76270dc3a83edab38fca0/src/main/clojure/clojure/tools/nrepl/middleware.clj#L26",
   :line 26,
   :var-type "function",
   :arglists ([middleware-var descriptor]),
   :doc
   "Sets the given [descriptor] map as the ::descriptor metadata on\nthe provided [middleware-var], after assoc'ing in the var's\nfully-qualified name as the descriptor's \"implemented-by\" value.",
   :namespace "clojure.tools.nrepl.middleware",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware/set-descriptor!"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :name "*eval*",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L21",
   :dynamic true,
   :line 21,
   :var-type "var",
   :arglists nil,
   :doc "Function returning the evaluation of its argument.",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/*eval*"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :name "*msg*",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L17",
   :dynamic true,
   :line 17,
   :var-type "var",
   :arglists nil,
   :doc "The message currently being evaluated.",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/*msg*"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :name "evaluate",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L55",
   :line 55,
   :var-type "function",
   :arglists
   ([bindings
     {:keys [code ns transport session eval file line column],
      :as msg}]),
   :doc
   "Evaluates some code within the dynamic context defined by a map of `bindings`,\nas per `clojure.core/get-thread-bindings`.\n\nUses `clojure.main/repl` to drive the evaluation of :code in a second\nmap argument (either a string or a seq of forms to be evaluated), which may\nalso optionally specify a :ns (resolved via `find-ns`).  The map MUST\ncontain a Transport implementation in :transport; expression results and errors\nwill be sent via that Transport.\n\nReturns the dynamic scope that remains after evaluating all expressions\nin :code.\n\nIt is assumed that `bindings` already contains useful/appropriate entries\nfor all vars indicated by `clojure.main/with-bindings`.",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/evaluate"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :name "interruptible-eval",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L205",
   :line 205,
   :var-type "function",
   :arglists ([h & configuration]),
   :doc
   "Evaluation middleware that supports interrupts.  Returns a handler that supports\n\"eval\" and \"interrupt\" :op-erations that delegates to the given handler\notherwise.",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/interruptible-eval"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :name "queue-eval",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/e61472f724c02576702196c491e59055f0e6f359/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L194",
   :line 194,
   :var-type "function",
   :arglists ([session executor f]),
   :doc "Queues the function for the given session.",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/queue-eval"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2263b6b019aa75462a42cc765357f2cecff5ef23/src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj",
   :name "load-file-code",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2263b6b019aa75462a42cc765357f2cecff5ef23/src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj#L51",
   :dynamic true,
   :line 51,
   :var-type "function",
   :arglists ([file file-path file-name]),
   :doc
   "Given the contents of a file, its _source-path-relative_ path,\nand its filename, returns a string of code containing a single\nexpression that, when evaluated, will load those contents with\nappropriate filename references and line numbers in metadata, etc.\n\nNote that because a single expression is produced, very large\nfile loads will fail due to the JVM method size limitation.\nIn such cases, see `load-large-file-code'`.",
   :namespace "clojure.tools.nrepl.middleware.load-file",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.load-file/load-file-code"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2263b6b019aa75462a42cc765357f2cecff5ef23/src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj",
   :name "wrap-load-file",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2263b6b019aa75462a42cc765357f2cecff5ef23/src/main/clojure/clojure/tools/nrepl/middleware/load_file.clj#L69",
   :line 69,
   :var-type "function",
   :arglists ([h]),
   :doc
   "Middleware that evaluates a file's contents, as per load-file,\nbut with all data supplied in the sent message (i.e. safe for use\nwith remote REPL environments).\n\nThis middleware depends on the availability of an :op \"eval\"\nmiddleware below it (such as interruptible-eval).",
   :namespace "clojure.tools.nrepl.middleware.load-file",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.load-file/wrap-load-file"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/d1613c99a07a64b55fbaed5806596463c1ad2f53/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj",
   :name "pr-values",
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/d1613c99a07a64b55fbaed5806596463c1ad2f53/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj#L8",
   :line 8,
   :var-type "function",
   :arglists ([h]),
   :doc
   "Middleware that returns a handler which transforms any :value slots\nin messages sent via the request's Transport to strings via `pr`,\ndelegating all actual message handling to the provided handler.\n\nRequires that results of eval operations are sent in messages in a\n:value slot.\n\nIf :value is already a string, and a sent message's :printed-value\nslot contains any truthy value, then :value will not be re-printed.\nThis allows evaluation contexts to produce printed results in :value\nif they so choose, and opt out of the printing here.",
   :namespace "clojure.tools.nrepl.middleware.pr-values",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.pr-values/pr-values"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/f95f2be94c2e43e61f8b7464978216787194490d/src/main/clojure/clojure/tools/nrepl/middleware/session.clj",
   :name "add-stdin",
   :file "src/main/clojure/clojure/tools/nrepl/middleware/session.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/f95f2be94c2e43e61f8b7464978216787194490d/src/main/clojure/clojure/tools/nrepl/middleware/session.clj#L216",
   :line 216,
   :var-type "function",
   :arglists ([h]),
   :doc
   "stdin middleware.  Returns a handler that supports a \"stdin\" :op-eration, which\nadds content provided in a :stdin slot to the session's *in* Reader.  Delegates to\nthe given handler for other operations.\n\nRequires the session middleware.",
   :namespace "clojure.tools.nrepl.middleware.session",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.session/add-stdin"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/f95f2be94c2e43e61f8b7464978216787194490d/src/main/clojure/clojure/tools/nrepl/middleware/session.clj",
   :name "session",
   :file "src/main/clojure/clojure/tools/nrepl/middleware/session.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/f95f2be94c2e43e61f8b7464978216787194490d/src/main/clojure/clojure/tools/nrepl/middleware/session.clj#L152",
   :line 152,
   :var-type "function",
   :arglists ([h]),
   :doc
   "Session middleware.  Returns a handler which supports these :op-erations:\n\n* \"ls-sessions\", which results in a response message\n  containing a list of the IDs of the currently-retained sessions in a\n  :session slot.\n* \"close\", which drops the session indicated by the\n  ID in the :session slot.  The response message's :status will include\n  :session-closed.\n* \"clone\", which will cause a new session to be retained.  The ID of this\n  new session will be returned in a response message in a :new-session\n  slot.  The new session's state (dynamic scope, etc) will be a copy of\n  the state of the session identified in the :session slot of the request.\n\nMessages indicating other operations are delegated to the given handler,\nwith the session identified by the :session ID added to the message. If\nno :session ID is found, a new session is created (which will only\npersist for the duration of the handling of the given message).\n\nRequires the interruptible-eval middleware (specifically, its binding of\n*msg* to the currently-evaluated message so that session-specific *out*\nand *err* content can be associated with the originating message).",
   :namespace "clojure.tools.nrepl.middleware.session",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.session/session"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :name "response-for",
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj#L29",
   :line 29,
   :var-type "function",
   :arglists ([{:keys [session id]} & response-data]),
   :doc
   "Returns a map containing the :session and :id from the \"request\" `msg`\nas well as all entries specified in `response-data`, which can be one\nor more maps (which will be merged), *or* key-value pairs.\n\n(response-for msg :status :done :value \"5\")\n(response-for msg {:status :interrupted})\n\nThe :session value in `msg` may be any Clojure reference type (to accommodate\nlikely implementations of sessions) that has an :id slot in its metadata,\nor a string.",
   :namespace "clojure.tools.nrepl.misc",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/response-for"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :name "returning",
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj#L19",
   :line 19,
   :var-type "macro",
   :arglists ([x & body]),
   :doc "Executes `body`, returning `x`.",
   :namespace "clojure.tools.nrepl.misc",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/returning"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :name "uuid",
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/ac95dc7da973f3d7edea75d0f6f9ce01ee18641d/src/main/clojure/clojure/tools/nrepl/misc.clj#L24",
   :line 24,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a new UUID string.",
   :namespace "clojure.tools.nrepl.misc",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/uuid"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "->Server",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L101",
   :line 101,
   :var-type "function",
   :arglists
   ([server-socket port open-transports transport greeting handler]),
   :doc
   "Positional factory function for class clojure.tools.nrepl.server.Server.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/->Server"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "default-handler",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L80",
   :line 80,
   :var-type "function",
   :arglists ([& additional-middlewares]),
   :doc
   "A default handler supporting interruptible evaluation, stdin, sessions, and\nreadable representations of evaluated expressions via `pr`.\n\nAdditional middlewares to mix into the default stack may be provided; these\nshould all be values (usually vars) that have an nREPL middleware descriptor\nin their metadata (see clojure.tools.nrepl.middleware/set-descriptor!).",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/default-handler"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "handle",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L23",
   :line 23,
   :var-type "function",
   :arglists ([handler transport]),
   :doc
   "Handles requests received via [transport] using [handler].\nReturns nil when [recv] returns nil for the given transport.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/handle"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "map->Server",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L101",
   :line 101,
   :var-type "function",
   :arglists ([m#]),
   :doc
   "Factory function for class clojure.tools.nrepl.server.Server, taking a map of keywords to field values.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/map->Server"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "start-server",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L121",
   :line 121,
   :var-type "function",
   :arglists
   ([&
     {:keys [port bind transport-fn handler ack-port greeting-fn],
      :or {port 0}}]),
   :doc
   "Starts a socket-based nREPL server.  Configuration options include:\n\n  * :port — defaults to 0, which autoselects an open port on localhost\n  * :bind — bind address, by default \"localhost\")\n  * :handler — the nREPL message handler to use for each incoming connection;\n      defaults to the result of `(default-handler)`\n  * :transport-fn — a function that, given a java.net.Socket corresponding\n      to an incoming connection, will return an value satisfying the\n      clojure.tools.nrepl.Transport protocol for that Socket.\n  * :ack-port — if specified, the port of an already-running server\n      that will be connected to to inform of the new server's port.\n      Useful only by Clojure tooling implementations.\n\n  Returns a (map) handle to the server that is started, which may be stopped\n  either via `stop-server`, (.close server), or automatically via `with-open`.\n  The port that the server is open on is available in the :port slot of the\n  server map (useful if the :port option is 0 or was left unspecified.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/start-server"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "stop-server",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L53",
   :line 53,
   :var-type "function",
   :arglists ([{:keys [open-transports server-socket], :as server}]),
   :doc "Stops a server started via `start-server`.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/stop-server"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj",
   :name "unknown-op",
   :file "src/main/clojure/clojure/tools/nrepl/server.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/db9125c566f0ada9284cbc6ea01fd59edfcd2ad3/src/main/clojure/clojure/tools/nrepl/server.clj#L68",
   :line 68,
   :var-type "function",
   :arglists ([{:keys [op transport], :as msg}]),
   :doc "Sends an :unknown-op :error for the given message.",
   :namespace "clojure.tools.nrepl.server",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/unknown-op"}
  {:name "Server",
   :var-type "record",
   :namespace "clojure.tools.nrepl.server",
   :arglists nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.server/Server",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "->FnTransport",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L25",
   :line 25,
   :var-type "function",
   :arglists ([recv-fn send-fn close]),
   :doc
   "Positional factory function for class clojure.tools.nrepl.transport.FnTransport.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/->FnTransport"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "->QueueTransport",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L158",
   :line 158,
   :var-type "function",
   :arglists ([in out]),
   :doc
   "Positional factory function for class clojure.tools.nrepl.transport.QueueTransport.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/->QueueTransport"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "bencode",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L87",
   :line 87,
   :var-type "function",
   :arglists ([s] [in out & [s]]),
   :doc
   "Returns a Transport implementation that serializes messages\nover the given Socket or InputStream/OutputStream using bencode.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/bencode"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "fn-transport",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L34",
   :line 34,
   :var-type "function",
   :arglists ([read write] [read write close]),
   :doc
   "Returns a Transport implementation that delegates its functionality\nto the 2 or 3 functions provided.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/fn-transport"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "piped-transports",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L164",
   :line 164,
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a pair of Transports that read from and write to each other.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/piped-transports"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "tty",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L113",
   :line 113,
   :var-type "function",
   :arglists ([s] [in out & [s]]),
   :doc
   "Returns a Transport implementation suitable for serving an nREPL backend\nvia simple in/out readers, as with a tty or telnet connection.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/tty"}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "tty-greeting",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L147",
   :line 147,
   :var-type "function",
   :arglists ([transport]),
   :doc
   "A greeting fn usable with clojure.tools.nrepl.server/start-server,\nmeant to be used in conjunction with Transports returned by the\n`tty` function.\n\nUsually, Clojure-aware client-side tooling would provide this upon connecting\nto the server, but telnet et al. isn't that.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/tty-greeting"}
  {:name "FnTransport",
   :var-type "type",
   :namespace "clojure.tools.nrepl.transport",
   :arglists nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/FnTransport",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "QueueTransport",
   :var-type "type",
   :namespace "clojure.tools.nrepl.transport",
   :arglists nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/QueueTransport",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :name "Transport",
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/20a3d1508beaa86e784610fdd7d962555b2faafb/src/main/clojure/clojure/tools/nrepl/transport.clj#L16",
   :line 16,
   :var-type "protocol",
   :arglists nil,
   :doc
   "Defines the interface for a wire protocol implementation for use\nwith nREPL.",
   :namespace "clojure.tools.nrepl.transport",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/Transport"}
  {:name "recv",
   :doc
   "Reads and returns the next message received.  Will block.\nShould return nil the a message is not available after `timeout`\nms or if the underlying channel has been closed.",
   :var-type "function",
   :namespace "clojure.tools.nrepl.transport",
   :arglists ([this] [this timeout]),
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/recv",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:name "send",
   :doc "Sends msg. Implementations should return the transport.",
   :var-type "function",
   :namespace "clojure.tools.nrepl.transport",
   :arglists ([this msg]),
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/send",
   :source-url nil,
   :raw-source-url nil,
   :file nil})}
