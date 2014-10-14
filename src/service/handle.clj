(ns service.handle
  (:require [service.route :as route]
            [ring.middleware.json :as middleware]
            [compojure.handler :as handler]
            [ring.middleware.logger :as logger]
            [cemerick.friend :as friend]
            [cemerick.friend [workflows :as workflows]
             [credentials :as creds]]
            ))

(def app
  (->
    (handler/site route/app-routes)
    (middleware/wrap-json-body)
    (middleware/wrap-json-response)
    (logger/wrap-with-logger))
  )

;(def secured-app
;  (-> app
;    (secure/secure-app)))



(def ^:private validate-uses
  {
    "root" {
             :username "admin"
             :password (creds/hash-bcrypt "admin_password")
             :roles #{::admin}
             }
    "dev" {
            :username "dev"
            :password (creds/hash-bcrypt "dev_password")
            :roles #{::user}
            }})

(def secured-app
  (-> app
    (friend/authenticate {:credential-fn (partial creds/bcrypt-credential-fn validate-uses)
                          :workflows [(workflows/interactive-form)]})
    ; ...required Ring middlewares ...
    ))