(ns
  ^{:author yangyang}
  config_service_clj.config
  (:use [ring.middleware.json :only [wrap-json-response]]
        [ring.util.response :only [response] :refer [response]])
  )

(defn get-all-configurations
  []
  (response {:document
             {:id "123"}
             })
  )

(defn create-new-configuration
  [configration]
  )

(defn get-configuration [id])

(defn update-configuration [id body])

(defn delete-configuration [id])
