(ns
  ^{:author twer}
  service.test.repo
  (:require [clojure.test :refer :all]
            [service.repo :as functions-under-test]))

(def document_id "document_id")
(def document {:id "document_id"
               :content "blabla"})

;(deftest basic-crud-happy-scenarios
;  (testing "should be able to add document to repo, and get document id as return value"
;    (let [result (functions-under-test/add document)]
;      (is (= result "document_id"))
;      )
;    )
;
;  (testing "should be able to update document against repo, and get updated document id as return value"
;    (let [result (functions-under-test/update document)]
;      (is (= result "document_id"))
;      (not (= "old_document_id" result))
;      )
;    )
;
;  (testing "should be able to delete a existed document in a repo, and get 0 as return value when sucessed "
;    (let [result (functions-under-test/delete document_id)]
;      (is (zero? result))
;      )
;    )
;
;  (testing "should be able to get document in repo"
;    (let [result (functions-under-test/get document_id)]
;      (is (= (:document_id (:content result)) "document_id"))
;      )
;    )
;  )
