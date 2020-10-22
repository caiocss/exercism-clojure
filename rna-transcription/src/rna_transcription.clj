(ns rna-transcription)

(defn- dna->rna [s]
  (case s
    \G \C
    \C \G
    \T \A
    \A \U
    (throw (AssertionError. "Wrong DNA!"))))

(defn to-rna [dna]
  (->> dna
       (map dna->rna)
       (apply str)))