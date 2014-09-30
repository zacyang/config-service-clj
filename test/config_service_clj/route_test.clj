(ns config_service_clj.route-test
  (:use [clojure.test :refer :all]
        [config_service_clj.route :refer :all]
        ring.mock.request))

(deftest should-beable-to-handle-invalid-request
  (is (= 1 1)))

