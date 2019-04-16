(ns assignment.test
  (:require [clojure.test :refer :all]
            [assignment.main :refer :all]
            [expectations :as expect]))

#_(deftest a-test
  (testing "FIXME, I fail."
   (is (= 1 1))))

(expect/expect nil? nil)

;;isPrime?
(expect/expect (= true (isPrime? 2)))
(expect/expect (= true (isPrime? 3)))
(expect/expect (= false (isPrime? 4)))
