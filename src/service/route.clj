(ns service.route
  (:use [service.config])
  (:require [compojure.route :as route]
            [compojure.core :refer :all]
            ))


(defroutes app-routes
  ;;todo : add health restart shutdown hook
  (context "/status" [] (defroutes status-routs)
    (GET "/" [] (#(println "good")))
    )
  (context "/configurations" [] (defroutes documents-routes
                                  (GET "/" [] (get-all-configurations))
                                  (POST "/" {body :body} (create-new-configuration body))
                                  (context "/:id" [id] (defroutes configuration-routes
                                                         (GET "/" [] (get-configuration id))
                                                         (PUT "/" {body :body} (update-configuration id body))
                                                         (DELETE "/" [] (delete-configuration id))))))
  (route/not-found "Not Found"))

