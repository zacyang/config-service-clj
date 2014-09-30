(ns
  ^{:author twer}
  config_service_clj.log)

(defn logging [chain] (fn [req] (
                                  (println "before")
                                  (chain req)
                                  (println "after"))))
