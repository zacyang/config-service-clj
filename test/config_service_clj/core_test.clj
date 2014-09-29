(ns config-service-clj.core-test
  (:use [clojure.test :refer :all]
        [config-service-clj.core :refer :all]
        ring.mock.request))

(deftest your-handler-test
  (is (= (handler (request :get "/doc/10"))
        {:status 200
         :headers {"Content-Type" "text/html"}
         :body "Hello World"})))

(deftest test-debug
  (is (= (+ 1 1) 2)))


