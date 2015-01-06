(ns embang.emit-test
  (:require [clojure.test :refer [deftest testing is]])
  (:use [embang.trap :only [value-cont]]
        embang.emit))

(deftest test-higher-order-functions
  (testing "map in CPS"
    (is (= (trampoline
            ($map value-cont nil (fn [cont $state lst]
                                   (cont (first lst) $state))
                  '((1) (2) (3))))
           '(1 2 3))
        "map on a single list")
    (is (= (trampoline
            ($map value-cont nil (fn [cont $state x y]
                                   (cont (+ x y) $state))
             '( 1 2 3) '(4 5 6)))
           '(5 7 9))
        "map on two lists"))

  (testing "reduce in CPS"
    (is (= (trampoline
            ($reduce value-cont nil (fn [cont $state x y]
                                      (cont (+ x y) $state))
                    '(1 2 3)))
           6)
        "reduce without default")
    (is (= (trampoline
            ($reduce value-cont nil (fn [cont $state x y]
                                      (cont(conj x y) $state))
                     nil
                     '(1 2 3)))
           '(3 2 1))
        "reduce with default"))

  (testing "filter in CPS"
    (is (= (trampoline
            ($filter value-cont nil (fn [cont $state x]
                                      (cont (odd? x) $state))
                      '(1 2 3)))
           '(1 3))
        "filter"))

  (testing "some in CPS"
    (is (= (not (trampoline
                 ($some value-cont nil (fn [cont $state x]
                                         (prn x)
                                         (cont (odd? x) $state))
                        '(2 4 6))))
           true)
        "some returns false")
    (is (= (trampoline
            ($some value-cont nil (fn [cont $state x]
                                    (cont (odd? x) $state))
                   '(2 3 4)))
           true)
        "some returns true")))
