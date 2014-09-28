(ns config-service-clj.core)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})

(defn log-hanlder [request] :doc "aspect of loging"
  )