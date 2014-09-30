(ns
  ^{:author yangyang}
  config_service_clj.config-test
  (:use [clojure.test :refer :all]
        [config_service_clj.config :refer :all]))

(deftest should-beable-to-get-all-configurations
  (is (= (:body (get-all-configurations)) '{:document {:id "123"}})))

(deftest should-get-all-configurlations-with-valid-schema
  (is (= (:body (get-all-configurations) ) )))
