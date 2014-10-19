(ns
  ^{:author yangyang}
  service.handle.config
  (:require [ring.middleware.json :only [wrap-json-response]]
            [ring.util.response :only [response] :refer [response]])
  )

(defrecord ConfigurationRecord [id profile name value])
(defn get-all-configurations
  []
  (response {:document {:id "123"}
             })
  )

(defn create-new-configuration
  [configration]
  )

(defn get-configuration [id])

(defn update-configuration [id body])

(defn delete-configuration [id])

(defn report-status [])

