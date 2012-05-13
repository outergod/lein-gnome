(ns leiningen.new.lein-gnome
  (:use [leiningen.new.templates :only [renderer name-to-path ->files]]))

(def render (renderer "lein_gnome"))

(defn lein-gnome
  "A template for new Gnome Shell extensions."
  [name group]
  (let [data {:name name
              :group group
              :sanitized (name-to-path name)}]
    (println "Generating a lein-gnome project named" (str name "."))
    (->files data
             ["src/hello.cljs" (render "hello.cljs" data)]
             ["src/stylesheet.css" (render "stylesheet.css" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)])))
