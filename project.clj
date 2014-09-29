(defproject config-service-clj "0.1.0-SNAPSHOT"
  :description "restful configuration service"
  :url "https://github.com/zacyang/config-service-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.0"]
                 [ring/ring-jetty-adapter "1.3.0"]
                 ]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler config-service-clj.core/handler}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}}
  )
