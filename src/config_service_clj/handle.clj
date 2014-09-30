(ns config_service_clj.handle
  (:require [config_service_clj.route :as route]
            [ring.middleware.json :as middleware]
            [compojure.handler :as handler]
            [ring.middleware.logger :as logger]
            ))

(def app
  (-> (handler/site route/app-routes)
    (middleware/wrap-json-body)
    (middleware/wrap-json-response)
    (logger/wrap-with-logger)))
