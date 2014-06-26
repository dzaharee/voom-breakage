(defproject voom-breakage "0.1.0-SNAPSHOT"
  :description "Minimal project to demonstrate voom bug"
  :url "https://github.com/dzaharee/voom-breakage"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ^{:voom {:repo "https://github.com/dzaharee/voom-breakage-dep"}}
                 [voom-breakage-dep "0.1.0-SNAPSHOT"]])
