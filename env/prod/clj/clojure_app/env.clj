(ns clojure-app.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[clojure-app started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-app has shut down successfully]=-"))
   :middleware identity})
