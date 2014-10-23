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
    (is (string? (save-record memRepo {:id 1 :content "content"})))
    )

  (testing "should return 1 when delete item by non-exists id "
    (def not-exits-id "not present id")
    (is (= 1 (delete-record memRepo not-exits-id))))

  (testing "should return 0 when delete item by a exits id"
    (def exits-id "valid id")
    (save-record memRepo {:id exits-id :content "content"})
    (is (= 1 (delete-record memRepo exits-id)))
    ))
