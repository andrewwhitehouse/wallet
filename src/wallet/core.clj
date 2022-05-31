(ns wallet.core
  (:require [wallet.handler :refer [app]]
            [ring.adapter.jetty :as jetty]))

(defn -main
  [& args]
  (let [port (or (System/getenv "PORT") 3000)]
    (log/info "Listening on port" port)
    (jetty/run-jetty app
                     {:port port
                      :join? true})))

