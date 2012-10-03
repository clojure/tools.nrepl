;   Copyright (c) Rich Hickey. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns #^{:author "Chas Emerick"}
  clojure.tools.nrepl.cmdline-test
  (:use [clojure.tools.nrepl-test :only (def-repl-test repl-server-fixture *server*)]
    clojure.test)
  (:require
    [clojure.tools.nrepl :as repl]))

(use-fixtures :once repl-server-fixture)

(comment  ;TODO
  (def-repl-test ack
  (repl/reset-ack-port!)
  (let [server-process (.exec (Runtime/getRuntime)
                         (into-array ["java" "-Dnreplacktest=y" "-cp" (System/getProperty "java.class.path")
                                      "clojure.tools.nrepl.main" "--ack" (str (:port *server*))]))
        acked-port (repl/wait-for-ack 20000)]
    (try
      (is acked-port "Timed out waiting for ack")
      (when acked-port
        (with-open [c2 (repl/connect acked-port)]
          ; just a sanity check
          (is (= "y" (-> (((:send c2) "(System/getProperty \"nreplacktest\")")) repl/read-response-value :value)))))
      (finally
        (.destroy server-process)))))

(def-repl-test explicit-port-argument
  (repl/reset-ack-port!)
  (let [free-port (with-open [ss (java.net.ServerSocket.)]
                    (.bind ss nil)
                    (.getLocalPort ss))
        server-process (.exec (Runtime/getRuntime)
                         (into-array ["java" "-Dnreplacktest=y" "-cp" (System/getProperty "java.class.path")
                                      "clojure.tools.nrepl.main" "--port" (str free-port) "--ack" (str (:port *server*))]))
        acked-port (repl/wait-for-ack 20000)]
    (try
      (is acked-port "Timed out waiting for ack")
      (is (= acked-port free-port))
      (finally
        (.destroy server-process))))))