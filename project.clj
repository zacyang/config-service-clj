(defproject config-service-clj "0.1.0-SNAPSHOT"
  :description "restful configuration service"
  :url "https://github.com/zacyang/config-service-clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.0"]
                 [ring/ring-jetty-adapter "1.3.0"]
                 [compojure "1.1.9"]
                 [ring/ring-json "0.3.1"]
                 [ring.middleware.logger "0.5.0"]
                 [metosin/ring-swagger-ui "2.0.17"]
                 [metosin/ring-swagger "0.13.0"]
                 [com.ashafa/clutch "0.4.0"]
                 ]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler service.handle/app}
  :profiles {:dev {:dependencies [[ring-mock "0.1.5"]]}}
  )
