;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns #^{:doc ""
       :author "Chas Emerick"}
  clojure.tools.nrepl.tooling.load
  (:import (java.io File StringReader))
  (:require
    [clojure.tools.nrepl.helpers :as helpers]))

(defn load-with-debug-info
  "Load a code string using a source file path and name source-path for debug info
   (line numbers, etc)."
  [code file-path filename]
  (clojure.lang.Compiler/load
    (StringReader. code)
    file-path
    filename))

(defn load-file-command
  [#^File f source-paths]
  (apply format
    "(clojure.tools.nrepl.tooling.load/load-with-debug-info %s %s %s)"
    (map helpers/string-argument
      [(slurp f "UTF-8")
       (.toAbsolutePath f)
       (.getName f)])))