(ns
  ^{:author yangyang}
  service.repo)

(defmulti)
(defn add [x]
  (:id x))

(defn update [x]
  x)

(defn delete [i]
  0)

(defn get [i]
  {:document {:id "123"}})

;;todo : use multi-method to solve the dispatch stuff
;;move this to seperate place
;;todo : shall read db info from configuration



