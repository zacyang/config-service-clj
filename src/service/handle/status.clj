(ns
  ^{:author yangyang}
  service.handle.status
  (:require [ring.util.response :only [response] :refer [response]]))

(defn get-status []
  response {:status "all good"}
  )
