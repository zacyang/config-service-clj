(ns
  ^{:author twer}
  service.log)

(defn logging [chain] (fn [req] (
                                  (println "before")
                                  (chain req)
                                  (println "after"))))
