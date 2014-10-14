(ns
  ^{:author yangyang}
  service.secure
  (:require [cemerick.friend :as friend]
            [cemerick.friend [workflows :as workflows]
             [credentials :as creds]]))


(def ^:private validate-uses
  {
    "root" {
             :username "admin"
             :password (creds/hash-bcrypt "123")
             :roles #{::admin}
             }
    "dev" {
            :username "dev"
            :password (creds/hash-bcrypt "123")
            :roles #{::user}
            }})

(defn secure-app [ring-app]
  (friend/authenticate
    ring-app
    {:credential-fn (partial creds/bcrypt-credential-fn validate-uses)
     :workflows [(workflows/http-basic)]}))
