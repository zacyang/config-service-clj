(ns
  ^{:author twer}
  test.service.repository.mem_repo
  (:require [service.repository.mem_repo :refer :all]
            [service.repository.repo :refer :all]
            [clojure.test :refer :all]
            )
  (:import [service.repository.mem_repo MemRepo]))

(def memRepo (MemRepo. "name" "url" "username" "password"))
(def test-item {:id 1 :content "content"})
(deftest should-get-add-item-to-repo-happy-pass
  (testing "get item by id"
    (is (string? (save-record memRepo test-item)))
    )

  (testing "update item sucess, with new uuid in return"
    (is (string? (update-record memRepo test-item))))

  (testing "delete item sucess, with exists uuid"
    (is (= 0 (delete-record memRepo "non-exist-id")))
    )
  )

(deftest should-get-error-return-when-opt-invalid-input
  (testing "should return 1 when delete item by non-exists id "
    (def not-exits-id "not present id")
    (is (= 1 (delete-record memRepo not-exits-id))))

  (testing "should return 1 when delete item by a non-exits id"
    (def exits-id "valid id")
    (save-record memRepo {:id exits-id :content "content"})
    (is (= 1 (delete-record memRepo exits-id)))
    ))
