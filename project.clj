(defproject lsp-repro "0.1.0-SNAPSHOT"
  :description "Reproduce a bug with clojure-lsp unresolved var highlighting"
  :dependencies [[org.clojure/clojure "1.10.2"]
                 [http-kit "2.5.3"]]
  :repl-options {:init-ns lsp-repro.core})
