(ns
  ^{:author yangyang}
  service.mem_repo
  (:require [service.repo :refer :all]
            [service.handle.config :refer :all])
  (:import [service.handle.config ConfigurationRecord]))

(def mem-repo '())
(defn generate-uuid [] (str (java.util.UUID/randomUUID)))
(defrecord MemRepo [repo-name url username password]
  Repo
  (save-record [this item] "add item to the repo, result in item id"
    (def new-uuid (generate-uuid))
    (conj mem-repo (ConfigurationRecord. new-uuid "dev" "fist" "url"))
    new-uuid
    )

  (update-record [this item] "update item in repo, result in new updated item id"
    (println item))

  (delete-record [this id] "delete item in repo, result in sucess(0) or not(1)"
    (if (or nil? empty? id)
      1

      )
    )

  (get-record [this id] "get item by item id, result in item itself or nil (not found)"
    (println id))
  )

