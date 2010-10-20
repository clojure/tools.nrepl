;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns #^{:doc ""
       :author "Chas Emerick"}
  clojure.tools.nrepl.helpers-test
  (:use clojure.test)
  (:require
    [clojure.tools.nrepl.helpers :as helpers]))

(deftest escape-and-string-argument
  (are [string escaped] (= escaped (helpers/escape string))
    "a" "a"
    "\"a" "\\\"a")
  (are [string arg] (= arg (helpers/string-argument string))
    "a" "\"a\""
    "\"a" "\"\\\"a\""))

