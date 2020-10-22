(ns armstrong-numbers
  (:require [clojure.math.numeric-tower :as math]))

(defn num->digs [n]
  (mapv #(Character/getNumericValue %) (str n)))

(defn armstrong? [num]
  (let [digs (num->digs num)
        num-size (count digs)]
    (->> digs
         (mapv #(math/expt % num-size))
         (reduce +)
         (= num))))