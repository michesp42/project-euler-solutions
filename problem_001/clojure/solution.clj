;; Problem 1. Multiples of 3 and 5.
;;
;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we
;; get 3, 5, 6 and 9. The sum of these multiples is 23.
;;
;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn sum-mul
  "
  Sum up the multiples below 1000 of a given number `n` using the formula for
  an arithmetic series where the first term is equal to the common difference.
  "
  [n]
  (let [t (quot 999 n)] ;; -> number of multiples to be added
    (quot (* t (+ t 1) n) 2))) ;; -> sum = t * (t + 1) * n / 2

(defn sol-arith-series
  "
  Calculate the sum of the multiples (below 1000) of 3 and 5 minus the sum of
  the multiples of 15. We have to subtract the sum of the multiples of 15
  because the multiples of 5 that are also multiples of 3 will have been added
  twice, so we have to weed out the duplications.
  "
  []
  (- (+ (sum-mul 3) (sum-mul 5))
     (sum-mul 15)))

(defn sol-rng
  "Solution by reducing a ranges."
  []
  (- (+ (reduce + (range 3 1000 3))
        (reduce + (range 5 1000 5)))
     (reduce + (range 15  1000 15))))

(defn is-mul?
  "Determine if a given number is a multiple of 3 or 5."
  [n]
  (or (= (mod n 3) 0)
      (= (mod n 5) 0)))

(defn sol-seq-comp
  "Solution by reducing a sequence comprehension."
  []
  (reduce + (for [n (range 3 1000) :when (is-mul? n)] n)))

(println (sol-arith-series))
(println (sol-rng))
(println (sol-seq-comp))
