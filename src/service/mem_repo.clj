(ns
  ^{:author yangyang}
  service.mem_repo
  (:require [service.repo :refer :all]))

(defn hello [] "hello")
(defrecord MemRepo [repo-name url username password]
  Repo
  (save-record [this item] "add item to the repo, result in item id"
    (println item))
  ;
  ;  (update [this item] "update item in repo, result in new updated item id"
  ;    (println item))
  ;
  ;  (delete [this id] "delete item in repo, result in sucess(0) or not(1)"
  ;    (println id))
  ;
  ;  (get [this id] "get item by item id, result in item itself or nil (not found)"
  ;    (println id))

  )
