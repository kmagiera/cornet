(ns cornet.loader
  (:use [cornet utils])
  (:require [clojure.java.io :as io]
            [clojure.core.cache :as cache])
  (:import [java.io File]))




(defn resource-loader [root]
  (fn [path]
    (io/resource (str root "/" path))
    ))


