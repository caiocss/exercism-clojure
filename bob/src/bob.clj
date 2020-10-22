(ns bob)

(defn uppercase? [string]
  (let [onlychar (re-seq #"[a-zA-Z]" string)]
    (and (> (count onlychar) 1)
      (= (clojure.string/upper-case string) string))))

(defn have-interrogation-symbol? [string]
  (clojure.string/ends-with? (clojure.string/trim string) "?"))

(defn response-for [string]
    (cond
      (empty? (clojure.string/trim string)) "Fine. Be that way!"
      (and (uppercase? string)
           (have-interrogation-symbol? string)) "Calm down, I know what I'm doing!"
      (have-interrogation-symbol? string) "Sure."
      (uppercase? string) "Whoa, chill out!"
      :else "Whatever."))