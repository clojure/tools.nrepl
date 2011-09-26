{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url "http://clojure.github.com/tools.nrepl/nrepl-api.html",
   :name "clojure.tools.nrepl",
   :author "Chas Emerick",
   :doc ""}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/5effea1d3623f45e81098e5f398303457feb2b0b/src/main/clojure/clojure/tools/nrepl/cmdline.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/nrepl.cmdline-api.html",
   :name "clojure.tools.nrepl.cmdline",
   :author "Chas Emerick",
   :doc ""}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/nrepl.helpers-api.html",
   :name "clojure.tools.nrepl.helpers",
   :author "Chas Emerick",
   :doc ""}),
 :vars
 ({:name "*print-error-detail*",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L54",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/*print-error-detail*",
   :doc
   "Function that is used to print REPL exceptions when *print-detail-on-error* is true.\nDefaults to clojure.stacktrace/print-cause-trace.",
   :var-type "var",
   :line 54,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([responses]),
   :name "combine-responses",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L387",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/combine-responses",
   :doc
   "Combines the provided response messages into a single response map.\nTypical usage being:\n\n    (combine-responses (repl-response-seq ((:send connection) \"(some-expression)\")))\n\nCertain message slots are combined in special ways:\n\n  - only the second :ns (last in a reduction) is retained\n  - :value is accumulated into an ordered collection\n  - :status is accumulated into a set\n  - string values (associated with e.g. :out and :err) are concatenated",
   :var-type "function",
   :line 387,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([port] [host port]),
   :name "connect",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L442",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/connect",
   :doc
   "Connects to a hosted REPL at the given host (defaults to localhost) and port,\nreturning a map containing two functions:\n\n- send: a function that takes at least one argument (a code string\n        to be evaluated) and optional kwargs:\n        :timeout - number in milliseconds specifying the maximum runtime of\n                   accompanying code (default: no limit)\n        (send ...) returns a response function, described below.\n- close: no-arg function that closes the underlying socket\n\nNote that the connection/map object also implements java.io.Closeable,\nand is therefore usable with with-open.\n\nResponse functions, returned from invocations of (send ...), accept zero or\none argument. The one-arg arity accepts either:\n    - a number of milliseconds, which is the maximum time that the invocation will block\n      before returning the next response message.  If the timeout is exceeded, nil\n      is returned.  Multiple response messages are expected for each sent request; a\n      response message with a :status of \"done\" indicates that the associated request\n      has been fully processed, and that no further response messages should be expected.\n      See response-seq and combine-responses for some utilities for consuming message\n      responses.\n    - the :interrupt keyword. This sends an interrupt message for the request\n      associated with the response function, and blocks for default-timeout milliseconds\n      for confirmation of the interrupt.\n\nThe 0-arg response function arity is the same as invoking (receive-fn default-timeout).",
   :var-type "function",
   :line 442,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([response-message]),
   :name "read-response-value",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L334",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/read-response-value",
   :doc
   "Returns the provided response message, replacing its :value string with\nthe result of (read)ing it.  Returns the message unchanged if the :value\nslot is empty.",
   :var-type "function",
   :line 334,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([client-state-atom]),
   :name "release-session!",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L196",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/release-session!",
   :doc
   "Releases the current session, indicating that it will not be requested\nagain.  Returns true iff the session had been previously retained.",
   :var-type "function",
   :line 196,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([response-fn] [response-fn timeout]),
   :name "response-seq",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L364",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/response-seq",
   :doc
   "Returns a lazy seq of the responses available through repeated invocations\nof the provided response function.  An optional timeout value can be provided,\nwhich will be passed along to the response function on each invocation.",
   :var-type "function",
   :line 364,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([client-state-atom]),
   :name "retain-session!",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L180",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/retain-session!",
   :doc
   "Retains the current repl session, returning the opaque string ID it\nis associated with.  This only needs to be done once per session to\nmaintain its retention.  Other connections must specify a session-id\nin order to use the corresponding session.\n\nPlease use release-session when you're done with one, or it'll never\nget GC'd.  This is an implementation detail; future versions of nrepl\nmay institute some kind of reasonable session expiration policy.",
   :var-type "function",
   :line 180,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([connection & body]),
   :name "send-with",
   :namespace "clojure.tools.nrepl",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj#L429",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/8d42963fbaf6cfca59f305a803f665d4985fe0a6/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl/send-with",
   :doc
   "Sends the body of code using the provided connection (literally! No\ninterpolation/quasiquoting of locals or other references is performed),\nreturning a REPL response function.",
   :var-type "macro",
   :line 429,
   :file "clojure/tools/nrepl.clj"}
  {:arglists ([f] [f source-root] [code file-path file-name]),
   :name "load-file-command",
   :namespace "clojure.tools.nrepl.helpers",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj#L14",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//nrepl-api.html#clojure.tools.nrepl.helpers/load-file-command",
   :doc
   "Returns a string expression that can be sent to an nREPL session to\nload the code in given local file in the remote REPL's environment,\npreserving debug information (e.g. line numbers, etc).\n\nTypical usage: ((:send connection)\n                 (load-file-command (java.io.File. \"/path/to/clojure/file.clj\")))\n\nIf appropriate, the source path from which the code is being loaded may\nbe provided as well (suitably trimming the file's path to a relative one\nwhen loaded).\n\nThe 3-arg variation of this function expects the full source of the file to be loaded,\nthe source-root-relative path of the source file, and the name of the file.  e.g.:\n\n  (load-file-command \"…code here…\" \"some/ns/name/file.clj\" \"file.clj\")",
   :var-type "function",
   :line 14,
   :file
   "/home/tom/src/clj/autodoc/../autodoc-work-area/tools.nrepl/src/src/main/clojure/clojure/tools/nrepl/helpers.clj"})}
