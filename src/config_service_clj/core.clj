(ns config-service-clj.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn log-hanlder [request] :doc "aspect of loging"
  )

(defroutes app-routes
  (GET "/" [] "hello world")
  (route/not-found "<h1>Page not found</h1>"))

(def app (handler/site app-routes))