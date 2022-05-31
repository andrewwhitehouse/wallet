(ns wallet.core
  (:require [wallet.handler :refer [app]]
            [ring.adapter.jetty :as jetty]))

(defn -main
  [& args]
  (let [port (or (Integer/parseInt (System/getenv "PORT")) 3000)]
    (println "Listening on port" port)
    (jetty/run-jetty app
                     {:port port
                      :join? true})))

