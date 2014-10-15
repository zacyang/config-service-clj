(ns service.route
  (:require [compojure.route :as route]
            [compojure.core :refer :all]
            [cemerick.friend :as friend]
            [service.handle.config :as config]
            ))


(defroutes app-routes
  ;;todo : add health restart shutdown hook
  (context "/status" [] (defroutes status-routes
                          (friend/wrap-authorize status-routes #{::admin})
                          (GET "/" [] ()))

    )
  (context "/configurations" [] (defroutes documents-routes
                                  (GET "/" [] (config/get-all-configurations))
                                  (POST "/" {body :body} (config/create-new-configuration body))
                                  (context "/:id" [id] (defroutes configuration-routes
                                                         (GET "/" [] (config/get-configuration id))
                                                         (PUT "/" {body :body} (config/update-configuration id body))
                                                         (DELETE "/" [] (config/delete-configuration id))))))
  (route/not-found "Not Found"))


