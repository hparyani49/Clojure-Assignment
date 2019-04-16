(ns clojure.examples.hello
	(:gen-class))

(def res_count 10)

(defn isprime? [a]
  (if (> (count (filter #(zero? (mod a %)) (range 2 a))) 0)
    false
    true))

(defn find-prime [no]
  (last (take no (filter #(isprime? %) (drop 2 (range))))))
  
(defn get_table [n]
(map (fn [a] (* n a)) (map find-prime (range 1 (+ 1 res_count)))))

(defn print_res [arr]
(println arr))

(defn get_prime []
    (run! println (into [] (map get_table (range 1 11)))))

(get_prime)
