(ns
  ^{:author yangyang}
  config_service_clj.repo
  (:require [com.ashafa.clutch :as clutch]))

(defn add [x])

(defn update [x])

(defn delete [i])

(defn get [i])

;;todo : use multi-method to solve the dispatch stuff
;;move this to seperate place
;;todo : shall read db info from configuration
(defn- open-db-connection []
  "open a data-base connection"
  (let [conn (doto
               (clutch/couch "test")
               (clutch/create!))]
    conn)
  )

(def ^{:private true} db-connection (delay (open-db-connection)))

(defn db [] @db-connection)

(defn load-record
  [id]
  {:content (get-in (db) [id])})

(defn save-record
  [data]
  (let [id (get-in data ["_id"])]
    (clutch/assoc! (db) id data)
    {:content (get-in (db) [id])}))


