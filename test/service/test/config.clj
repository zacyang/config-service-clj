(ns
  ^{:author yangyang}
  service.test.config
  (:use [clojure.test :refer :all]
        [service.config :refer :all]))

(deftest should-beable-to-get-all-configurations
  (is (= (:body (get-all-configurations)) '{:document {:id "123"}})))

(deftest should-get-all-configurlations-with-valid-schema
  (is (= (:body (get-all-configurations) ) )))
