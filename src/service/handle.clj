(ns service.handle
  (:require [service.route :as route]
            [ring.middleware.json :as middleware]
            [compojure.handler :as handler]
            [ring.middleware.logger :as logger]
            [ring.swagger.ui :as swagger-ui]
            [compojure.api.swagger]
            ))

(def app
  (-> (handler/site route/app-routes)
    (middleware/wrap-json-body)
    (middleware/wrap-json-response)
    (logger/wrap-with-logger))
  )
