(ns config_service_clj.route
  (:use [config_service_clj.config])
  (:require [compojure.route :as route]
            [compojure.core :refer :all]
            ))


(defroutes app-routes
  (context "/configurations" [] (defroutes documents-routes
                                  (GET "/" [] (get-all-configurations))
                                  (POST "/" {body :body} (create-new-configuration body))
                                  (context "/:id" [id] (defroutes configuration-routes
                                                         (GET "/" [] (get-configuration id))
                                                         (PUT "/" {body :body} (update-configuration id body))
                                                         (DELETE "/" [] (delete-configuration id))))))
  (route/not-found "Not Found"))


