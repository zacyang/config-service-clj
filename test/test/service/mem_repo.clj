(ns
  ^{:author twer}
  test.service.mem_repo
  (:require [service.mem_repo :refer :all]
            [service.repo :refer :all]
            [clojure.test :refer :all]
            )
  (:import [service.mem_repo MemRepo]))

(def memRepo (MemRepo. "name" "url" "username" "password"))

(deftest should-get-add-item-to-repo
  (testing "get item by id"
    (is (= (save-record memRepo {:id 1 :content "content"})))
    (is (= (hello) "hello"))
    ))
