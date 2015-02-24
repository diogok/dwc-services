(defproject dwc-services "0.0.20"
  :description "Simple web api to convert darwincore formats and perform analysis."
  :url "http://github.com/CNCFlora/dwc-services"
  :license {:name "MIT" }
  :ring {:handler dwc-services.server/app :reload-paths ["src"]}
  :resources-path "resources"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [dwc-io "0.0.40"]
                 [dwc-analysis "0.0.23"]
                 [compojure "1.1.8"]
                 [ring/ring-core "1.3.1"]
                 [ring/ring-jetty-adapter "1.3.1"]
                 [org.clojure/data.json "0.2.5"]
                 [org.clojars.diogok/ring-gzip-middleware "0.0.2"]
                 [clj-http "0.9.0"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [javax.servlet/servlet-api "2.5"]]
                   :plugins [[lein-ring "0.9.1"]
                             [lein-midje "3.1.3"]]}})
