(ns reverse-string)

(defn reverse-string [s]
  (->> s
       (reduce conj '())
       (apply str)))

;Other old code
;(defn reverse-string [s]
;  (let [reversed-string (reduce conj '() s)]
;    (apply str reversed-string)))

;Old Code
;(defn reverse-string
;  ([s]
;   (reverse-string [] s))
;
;  ([reversed-string normal-string]
;   (if (seq normal-string)
;     (recur (conj reversed-string (last normal-string))
;            (butlast normal-string))
;     (str (reduce str reversed-string)))))