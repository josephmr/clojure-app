(ns clojure-app.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [clojure-app.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure-app started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-app has shut down successfully]=-"))
   :middleware wrap-dev})
