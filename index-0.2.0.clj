{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl-api.html",
   :name "clojure.tools.nrepl",
   :author "Chas Emerick",
   :doc "High level nREPL client support."}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/ack.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.ack-api.html",
   :name "clojure.tools.nrepl.ack",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.bencode-api.html",
   :name "clojure.tools.nrepl.bencode",
   :author "Meikel Brandmeyer",
   :doc "A netstring and bencode implementation for Clojure."}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/cmdline.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.cmdline-api.html",
   :name "clojure.tools.nrepl.cmdline",
   :author "Chas Emerick",
   :doc "A proof-of-concept command-line client for nREPL."}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.helpers-api.html",
   :name "clojure.tools.nrepl.helpers",
   :author "Chas Emerick",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.interruptible-eval-api.html",
   :name "clojure.tools.nrepl.middleware.interruptible-eval",
   :author "Chas Emerick",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.pr-values-api.html",
   :name "clojure.tools.nrepl.middleware.pr-values",
   :author "Chas Emerick",
   :doc nil}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/bbe598f6682e0b0b4d75133c15563194131b3a2f/src/main/clojure/clojure/tools/nrepl/middleware/session.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.middleware.session-api.html",
   :name "clojure.tools.nrepl.middleware.session",
   :author "Chas Emerick",
   :doc "Support for persistent, cross-connection REPL sessions."}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.misc-api.html",
   :name "clojure.tools.nrepl.misc",
   :author "Chas Emerick",
   :doc
   "Misc utilities used in nREPL's implementation (potentially also useful\nfor anyone extending it)."}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/26dbf11faa09f1e05b9d97dd815e8efca4fe41cc/src/main/clojure/clojure/tools/nrepl/server.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.server-api.html",
   :name "clojure.tools.nrepl.server",
   :author "Chas Emerick",
   :doc "Default server implementations"}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.transport-api.html",
   :name "clojure.tools.nrepl.transport",
   :author "Chas Emerick",
   :doc nil}),
 :vars
 ({:arglists ([transport response-timeout]),
   :name "client",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L29",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/client",
   :doc
   "Returns a fn of zero and one argument, both of which return the current head of a single\nresponse-seq being read off of the given client-side transport.  The one-arg arity will\nsend a given message on the transport before returning the seq.\n\nMost REPL interactions are best performed via `message` and `client-session` on top of\na client fn returned from this fn.",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([client & {:keys [session clone]}]),
   :name "client-session",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L101",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/client-session",
   :doc
   "Returns a function of one argument.  Accepts a message that is sent via the\nclient provided with a fixed :session id added to it.  Returns the\nhead of the client's response seq, filtered to include only\nmessages related to the :session id that will terminate when the session is\nclosed.",
   :var-type "function",
   :line 101,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([& body]),
   :name "code",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L132",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/code",
   :doc
   "Expands into a string consisting of the macro's body's forms\n(literally, no interpolation/quasiquoting of locals or other\nreferences), suitable for use in an :eval message, e.g.:\n\n{:op :eval, :code (code (+ 1 1) (slurp \"foo.txt\"))}",
   :var-type "macro",
   :line 132,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([responses]),
   :name "combine-responses",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L111",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/combine-responses",
   :doc
   "Combines the provided seq of response messages into a single response map.\n\nCertain message slots are combined in special ways:\n\n  - only the last :ns is retained\n  - :value is accumulated into an ordered collection\n  - :status is accumulated into a set\n  - string values (associated with e.g. :out and :err) are concatenated",
   :var-type "function",
   :line 111,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists
   ([&
     {:keys [port host transport-fn],
      :or {transport-fn transport/bencode, host "localhost"}}]),
   :name "connect",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L163",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/connect",
   :doc
   "Connects to a socket-based REPL at the given host (defaults to localhost) and port,\nreturning the Transport (by default clojure.tools.nrepl.transport/bencode)\nfor that connection.\n\nTransports are most easily used with `client`, `client-session`, and\n`message`, depending on the semantics desired.",
   :var-type "function",
   :line 163,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([client {:keys [id], :as msg, :or {id (uuid)}}]),
   :name "message",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L81",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/message",
   :doc
   "Returns a function of one argument.  Accepts a message that is sent via the\nclient provided with a fixed message :id added to it.  Returns the\nhead of the client's response seq, filtered to include only\nmessages related to the message :id that will terminate upon receipt of a\n\"done\" :status.",
   :var-type "function",
   :line 81,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([client & {:keys [clone]}]),
   :name "new-session",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L91",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/new-session",
   :doc
   "Provokes the creation and retention of a new session, optionally as a clone\nof an existing retained session, the id of which must be provided as a :clone\nkwarg.  Returns the new session's id.",
   :var-type "function",
   :line 91,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([{:keys [value], :as msg}]),
   :name "read-response-value",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L141",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/read-response-value",
   :doc
   "Returns the provided response message, replacing its :value string with\nthe result of (read)ing it.  Returns the message unchanged if the :value\nslot is empty or not a string.",
   :var-type "function",
   :line 141,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([transport] [transport timeout]),
   :name "response-seq",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L19",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/response-seq",
   :doc
   "Returns a lazy seq of messages received via the given Transport.\nCalled with no further arguments, will block waiting for each message.\nThe seq will end only when the underlying Transport is closed (i.e.\nreturns nil from `recv`) or if a message takes longer than `timeout`\nmillis to arrive.",
   :var-type "function",
   :line 19,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:arglists ([responses]),
   :name "response-values",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L153",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/response-values",
   :doc
   "Given a seq of responses (as from response-seq or returned from any function returned\nby client or client-session), returns a seq of values read from :value slots found\ntherein.",
   :var-type "function",
   :line 153,
   :file "src/main/clojure/clojure/tools/nrepl.clj"}
  {:file "src/main/clojure/clojure/tools/nrepl.clj",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/71866624044452c402ba631bc78b919d79dd4514/src/main/clojure/clojure/tools/nrepl.clj#L226",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl/version",
   :namespace "clojure.tools.nrepl",
   :line 226,
   :var-type "var",
   :doc
   "Current version of nREPL, map of :major, :minor, :incremental, and :qualifier.",
   :name "version"}
  {:arglists ([timeout]),
   :name "wait-for-ack",
   :namespace "clojure.tools.nrepl.ack",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/ack.clj#L16",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/ack.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.ack/wait-for-ack",
   :doc
   "Waits for a presumably just-launched nREPL server to connect and\ndeliver its port number.  Returns that number if it's delivered\nwithin `timeout` ms, otherwise nil.  Assumes that `ack`\nmiddleware has been applied to the local nREPL server handler.\n\nExpected usage:\n\n(reset-ack-port!)\n(start-server already-running-server-port)\n=> (wait-for-ack)\n59872 ; the port of the server started via start-server",
   :var-type "function",
   :line 16,
   :file "src/main/clojure/clojure/tools/nrepl/ack.clj"}
  {:arglists ([input]),
   :name "read-bencode",
   :namespace "clojure.tools.nrepl.bencode",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj#L253",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/read-bencode",
   :doc "Read bencode token from the input stream.",
   :var-type "function",
   :line 253,
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:arglists ([input]),
   :name "read-bencode-netstring",
   :namespace "clojure.tools.nrepl.bencode",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj#L430",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/read-bencode-netstring",
   :doc
   "Read a netstring in bencode format. That means without trailing comma.\nReturns the byte array of read bytes.",
   :var-type "function",
   :line 430,
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:arglists ([input]),
   :name "read-netstring",
   :namespace "clojure.tools.nrepl.bencode",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj#L119",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/read-netstring",
   :doc
   "Reads a classic netstring from input—an InputStream. Returns the\ncontained binary data as byte array.",
   :var-type "function",
   :line 119,
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:arglists ([output content]),
   :name "write-bencode-netstring",
   :namespace "clojure.tools.nrepl.bencode",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj#L440",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/write-bencode-netstring",
   :doc
   "Write binary content in bencode netstring format. That means without\ntrailing comma. Takes a byte array as content.",
   :var-type "function",
   :line 440,
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:arglists ([output content]),
   :name "write-netstring",
   :namespace "clojure.tools.nrepl.bencode",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj#L198",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/bencode.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.bencode/write-netstring",
   :doc
   "Write the given binary data to the output stream in form of a classic\nnetstring.",
   :var-type "function",
   :line 198,
   :file "src/main/clojure/clojure/tools/nrepl/bencode.clj"}
  {:arglists ([f] [f source-root] [code file-path file-name]),
   :name "load-file-command",
   :namespace "clojure.tools.nrepl.helpers",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/helpers.clj#L13",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/2b2b735df9c5d4bdc4d987ad82fe282a07877b90/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.helpers/load-file-command",
   :doc
   "Returns a string expression that can be sent to an nREPL session to\nload the code in given local file in the remote REPL's environment,\npreserving debug information (e.g. line numbers, etc).\n\nTypical usage: ((:send connection)\n                 (load-file-command (java.io.File. \"/path/to/clojure/file.clj\")))\n\nIf appropriate, the source path from which the code is being loaded may\nbe provided as well (suitably trimming the file's path to a relative one\nwhen loaded).\n\nThe 3-arg variation of this function expects the full source of the file to be loaded,\nthe source-root-relative path of the source file, and the name of the file.  e.g.:\n\n  (load-file-command \"…code here…\" \"some/ns/name/file.clj\" \"file.clj\")",
   :var-type "function",
   :line 13,
   :file "src/main/clojure/clojure/tools/nrepl/helpers.clj"}
  {:name "*msg*",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L13",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/*msg*",
   :doc "The message currently being evaluated.",
   :var-type "var",
   :line 13,
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj"}
  {:arglists ([bindings {:keys [code ns transport], :as msg}]),
   :name "evaluate",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L17",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/evaluate",
   :doc
   "Evaluates some code within the dynamic context defined by a map of `bindings`,\nas per `clojure.core/get-thread-bindings`.\n\nUses `clojure.main/repl` to drive the evaluation of :code in a second\nmap argument (either a string or a seq of forms to be evaluated), which may\nalso optionally specify a :ns (resolved via `find-ns`).  The map MUST\ncontain a Transport implementation in :transport; expression results and errors\nwill be sent via that Transport.\n\nReturns the dynamic scope that remains after evaluating all expressions\nin :code.\n\nIt is assumed that `bindings` already contains useful/appropriate entries\nfor all vars indicated by `clojure.main/with-bindings`.",
   :var-type "function",
   :line 17,
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj"}
  {:arglists
   ([h & {:keys [executor], :or {executor (configure-executor)}}]),
   :name "interruptible-eval",
   :namespace "clojure.tools.nrepl.middleware.interruptible-eval",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj#L144",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/9af6e2bc287e52b6d585fac4c45b0a2ec976fbb6/src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.interruptible-eval/interruptible-eval",
   :doc
   "Evaluation middleware that supports interrupts.  Returns a handler that supports\n\"eval\" and \"interrupt\" :op-erations that delegates to the given handler\notherwise.",
   :var-type "function",
   :line 144,
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/interruptible_eval.clj"}
  {:arglists ([h]),
   :name "pr-values",
   :namespace "clojure.tools.nrepl.middleware.pr-values",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj#L7",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.middleware.pr-values/pr-values",
   :doc
   "Middleware that returns a handler which transforms any :value slots\nin messages sent via the request's Transport to strings via `pr`,\ndelegating all actual message handling to the provided handler.\n\nRequires that results of eval operations are sent in messages in a\n:value slot.",
   :var-type "function",
   :line 7,
   :file
   "src/main/clojure/clojure/tools/nrepl/middleware/pr_values.clj"}
  {:arglists ([{:keys [session id]} & response-data]),
   :name "response-for",
   :namespace "clojure.tools.nrepl.misc",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj#L29",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/response-for",
   :doc
   "Returns a map containing the :session and :id from the \"request\" `msg`\nas well as all entries specified in `response-data`, which can be one\nor more maps (which will be merged), *or* key-value pairs.\n\n(response-for msg :status :done :value \"5\")\n(response-for msg {:status :interrupted})\n\nThe :session value in `msg` may be any Clojure reference type (to accommodate\nlikely implementations of sessions) that has an :id slot in its metadata,\nor a string.",
   :var-type "function",
   :line 29,
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj"}
  {:arglists ([x & body]),
   :name "returning",
   :namespace "clojure.tools.nrepl.misc",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj#L19",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/returning",
   :doc "Executes `body`, returning `x`.",
   :var-type "macro",
   :line 19,
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj"}
  {:arglists ([]),
   :name "uuid",
   :namespace "clojure.tools.nrepl.misc",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj#L24",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/4e3317c5ab032d0e08bc359966db64be702d2752/src/main/clojure/clojure/tools/nrepl/misc.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.misc/uuid",
   :doc "Returns a new UUID string.",
   :var-type "function",
   :line 24,
   :file "src/main/clojure/clojure/tools/nrepl/misc.clj"}
  {:arglists ([s] [in out & [s]]),
   :name "bencode",
   :namespace "clojure.tools.nrepl.transport",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L45",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/bencode",
   :doc
   "Returns a Transport implementation that serializes messages\nover the given Socket or InputStream/OutputStream using bencode.",
   :var-type "function",
   :line 45,
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj"}
  {:arglists ([read write] [read write close]),
   :name "fn-transport",
   :namespace "clojure.tools.nrepl.transport",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L32",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/fn-transport",
   :doc
   "Returns a Transport implementation that delegates its functionality\nto the 2 or 3 functions provided.",
   :var-type "function",
   :line 32,
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj"}
  {:arglists ([]),
   :name "piped-transports",
   :namespace "clojure.tools.nrepl.transport",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L114",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/piped-transports",
   :doc
   "Returns a pair of Transports that read from and write to each other.",
   :var-type "function",
   :line 114,
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj"}
  {:arglists ([s] [in out & [s]]),
   :name "tty",
   :namespace "clojure.tools.nrepl.transport",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L63",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/tty",
   :doc
   "Returns a Transport implementation suitable for serving an nREPL backend\nvia simple in/out readers, as with a tty or telnet connection.",
   :var-type "function",
   :line 63,
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj"}
  {:arglists ([transport]),
   :name "tty-greeting",
   :namespace "clojure.tools.nrepl.transport",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/tty-greeting",
   :doc
   "A greeting fn usable with clojure.tools.nrepl.server/start-server,\nmeant to be used in conjunction with Transports returned by the\n`tty` function.\n\nUsually, Clojure-aware client-side tooling would provide this upon connecting\nto the server, but telnet et al. isn't that.",
   :var-type "function",
   :line 97,
   :file "src/main/clojure/clojure/tools/nrepl/transport.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/FnTransport",
   :namespace "clojure.tools.nrepl.transport",
   :var-type "type",
   :name "FnTransport"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/QueueTransport",
   :namespace "clojure.tools.nrepl.transport",
   :var-type "type",
   :name "QueueTransport"}
  {:file "src/main/clojure/clojure/tools/nrepl/transport.clj",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b01a228748babbe959e5c967df4096e35d05d23d/src/main/clojure/clojure/tools/nrepl/transport.clj#L15",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/Transport",
   :namespace "clojure.tools.nrepl.transport",
   :line 15,
   :var-type "protocol",
   :doc
   "Defines the interface for a wire protocol implementation for use\nwith nREPL.",
   :name "Transport"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/recv",
   :namespace "clojure.tools.nrepl.transport",
   :var-type "function",
   :arglists ([this] [this timeout]),
   :doc
   "Reads and returns the next message received.  Will block.\nShould return nil the a message is not available after `timeout`\nms or if the underlying channel has been closed.",
   :name "recv"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.transport/send",
   :namespace "clojure.tools.nrepl.transport",
   :var-type "function",
   :arglists ([this msg]),
   :doc "Sends msg. Implementations should return the transport.",
   :name "send"})}
