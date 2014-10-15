(ns
  ^{:author yangyang}
  service.repo
  (:import [org.apache.log4j.spi DefaultRepositorySelector]))

(defprotocol Rrepo
  "Protocol for repository of storing items."
  (add [item] "add item to the repo, result in item id")

  (update [item] "update item in repo, result in new updated item id")

  (delete [id] "delete item in repo, result in sucess(0) or not(1)")

  (get [id] "get item by item id, result in item itself or nil (not found)")
  )


;;todo : use multi-method to solve the dispatch stuff
;;move this to seperate place
;;todo : shall read db info from configuration



