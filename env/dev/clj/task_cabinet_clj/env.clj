(ns task-cabinet-clj.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [task-cabinet-clj.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[task-cabinet-clj started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[task-cabinet-clj has shut down successfully]=-"))
   :middleware wrap-dev})
