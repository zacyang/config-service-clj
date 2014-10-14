(ns service.handle
  (:require [service.route :as route]
            [service.secure :as secure]
            [ring.middleware.json :as middleware]
            [compojure.handler :as handler]
            [ring.middleware.logger :as logger]
            ))

(def app
  (->
    (handler/site route/app-routes)
    (middleware/wrap-json-body)
    (middleware/wrap-json-response)
    (logger/wrap-with-logger))
  )

(def secured-app
  (-> app
    (secure/secure-app)))
