(ns lambda-calculus.core)

(defn zero [f]
  (fn [x] x))

(defn next-number [number]
  (fn [f]
    (fn [x]
      (f ((number f) x)))))

(def one (next-number zero))

(def two (next-number one))

(def three (next-number two))

(defn print-number [number]
  ((number inc) 0))
