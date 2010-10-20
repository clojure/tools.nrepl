;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns #^{:doc ""
       :author "Chas Emerick"}
  clojure.tools.nrepl.pprinting-test
  (:use [clojure.tools.nrepl-test :only (def-repl-test repl-server-fixture)]
    clojure.test)
  (:require [clojure.tools.nrepl :as repl]))

(use-fixtures :once repl-server-fixture)

(defmacro def-pp-test
  [name & body]
  (when (repl/pretty-print-available?)
    `(def-repl-test ~name
       (~'repl-receive "(set! clojure.tools.nrepl/*pretty-print* true)")
       ~@body)))

(def-pp-test simple-collection
  (is (< 20 (->> (repl "(range 100)")
               repl/response-seq
               repl/combine-responses
               :value
               first 
               (filter #(= \newline %))
               count))))

(def-pp-test toggle-pprinting
  (is (repl-value "clojure.tools.nrepl/*pretty-print*"))
  (is (repl-value "(clojure.tools.nrepl/pretty-print?)"))
  (repl-receive "(set! clojure.tools.nrepl/*pretty-print* false)")
  (is (not (repl-value "clojure.tools.nrepl/*pretty-print*")))
  (is (not (repl-value "(clojure.tools.nrepl/pretty-print?)"))))