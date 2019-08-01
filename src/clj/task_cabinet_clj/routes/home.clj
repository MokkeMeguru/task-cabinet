(ns task-cabinet-clj.routes.home
  (:require
    [task-cabinet-clj.layout :as layout]
    [task-cabinet-clj.db.core :as db]
    [clojure.java.io :as io]
    [task-cabinet-clj.middleware :as middleware]
    [ring.util.http-response :as response]))

(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats]}
   ["/" {:get home-page}]
   ["/about" {:get about-page}]])

