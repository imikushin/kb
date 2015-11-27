(defproject kb "0.1.0-SNAPSHOT"
  :description "KillingBilling"
  :url "http://killingbilling.com"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]]

  :profiles {:dev {:dependencies [[expectations "2.1.3"]
                                  [org.clojure/tools.namespace "0.2.10"]]}}
  )
