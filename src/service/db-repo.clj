(ns
  ^{:author twer}
  service.db-repo
  (:require [com.ashafa.clutch :as clutch]))


(defn- open-db-connection []
  "open a data-base connection"
  (let [conn (doto
               (clutch/couch "test")
               (clutch/create!))]
    conn)
  )

(def ^{:private true} db-connection (delay (open-db-connection)))

(defn db [] @db-connection)

(defn get-record
  [id]
  {:content (get-in (db) [id])})

(defn save-record
  [data]
  (let [id (get-in data ["_id"])]
    (clutch/assoc! (db) id data)
    {:content (get-in (db) [id])}))
