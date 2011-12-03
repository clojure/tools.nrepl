{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.nrepl/blob/a6851d9cbfa35374c9bad2f8abc738d988b4b55e/src/main/clojure/clojure/tools/nrepl.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl-api.html",
   :name "clojure.tools.nrepl",
   :author "Chas Emerick",
   :doc ""}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/5effea1d3623f45e81098e5f398303457feb2b0b/src/main/clojure/clojure/tools/nrepl/cmdline.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.cmdline-api.html",
   :name "clojure.tools.nrepl.cmdline",
   :author "Chas Emerick",
   :doc ""}
  {:source-url
   "https://github.com/clojure/tools.nrepl/blob/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl/clojure.tools.nrepl.helpers-api.html",
   :name "clojure.tools.nrepl.helpers",
   :author "Chas Emerick",
   :doc ""}),
 :vars
 ({:arglists ([f] [f source-root] [code file-path file-name]),
   :name "load-file-command",
   :namespace "clojure.tools.nrepl.helpers",
   :source-url
   "https://github.com/clojure/tools.nrepl/blob/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj#L14",
   :raw-source-url
   "https://github.com/clojure/tools.nrepl/raw/b2267071210b83c37bb8d03f4992bc587a7e2c01/src/main/clojure/clojure/tools/nrepl/helpers.clj",
   :wiki-url
   "http://clojure.github.com/tools.nrepl//clojure.tools.nrepl-api.html#clojure.tools.nrepl.helpers/load-file-command",
   :doc
   "Returns a string expression that can be sent to an nREPL session to\nload the code in given local file in the remote REPL's environment,\npreserving debug information (e.g. line numbers, etc).\n\nTypical usage: ((:send connection)\n                 (load-file-command (java.io.File. \"/path/to/clojure/file.clj\")))\n\nIf appropriate, the source path from which the code is being loaded may\nbe provided as well (suitably trimming the file's path to a relative one\nwhen loaded).\n\nThe 3-arg variation of this function expects the full source of the file to be loaded,\nthe source-root-relative path of the source file, and the name of the file.  e.g.:\n\n  (load-file-command \"…code here…\" \"some/ns/name/file.clj\" \"file.clj\")",
   :var-type "function",
   :line 14,
   :file "src/main/clojure/clojure/tools/nrepl/helpers.clj"})}
