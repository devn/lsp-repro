(ns lsp-repro.core
  (:require [org.httpkit.client :as http]))

(defn foo
  []
  @(http/get "http://www.example.com"))
