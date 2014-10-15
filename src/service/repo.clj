(ns
  ^{:author yangyang}
  service.repo
  )

(defprotocol Repo
  (save-record [this item] "add item to the repo, result in item id")

  (update [this item] "update item in repo, result in new updated item id")

  (delete [this id] "delete item in repo, result in sucess(0) or not(1)")

  (get [this id] "get item by item id, result in item itself or nil (not found)")
  )


