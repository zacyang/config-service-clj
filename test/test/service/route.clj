(ns test.service.route
  (:use [clojure.test :refer :all]
        [service.route :refer :all :as functions-under-test]
        ring.mock.request))

(deftest test-app-routes
  (testing "main route"
    (let [response (functions-under-test/app-routes (request :get "/configurations"))]
      (is (= (:status response) 200))
      ))

  (testing "not-found route"
    (let [response (functions-under-test/app-routes (request :get "/invalid"))]
      (is (= (:status response) 404)))))

