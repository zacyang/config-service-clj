(ns
  ^{:author twer}
  service.db_repo
  (:require [com.ashafa.clutch :as clutch]
            [service.repo]))


(defn- open-db-connection []
  "Open a data-base connection."
  (let [conn (doto
               (clutch/couch "test")
               (clutch/create!))]
    conn)
  )

(def :private db-connection (delay (open-db-connection)))

(defn- db [] @db-connection)

(defn- get-record
  [id]
  {:content (get-in (db) [id])})

(defn- save-record
  [data]
  (let [id (get-in data ["_id"])]
    (clutch/assoc! (db) id data)
    {:content (get-in (db) [id])}))

(extend-protocol Repo
  DataBaseRepository
  (save-record [^:db item]
    "add item to the repo, result in item id"
    save-record [^:db item])

  (update [^:db item]
    "update item in repo, result in new updated item id"
    (clutch/put-document db item)
    )

  (delete [^:db id]
    "delete item in repo, result in sucess(0) or not(1)"
    (clutch/delete-document db (clutch/get-document db id)))

  (get [^:db id]
    "get item by item id, result in item itself or nil (not found)"
    (clutch/get-document db id))
  )
