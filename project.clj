(defproject clojure-sample "1.0.1"
  :min-lein-version "2.0.0"
  :description "Hello World Clojure Web App"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.2"]]
  :main ^:skip-aot api.app)
