(ns config_service_clj.handle
  (:use [config_service_clj.route :as route]
        [ring.middleware.json :as middleware]
        [compojure.handler :as handler]
        ))

(def app
  (-> (handler/site app-routes)
    (middleware/wrap-json-body)
    (middleware/wrap-json-response)))
