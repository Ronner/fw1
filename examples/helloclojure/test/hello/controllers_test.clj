(ns hello.controllers-test
  (:require [clojure.test :refer :all]
            [hello.controllers.main :refer :all]))

(deftest default-item
  (testing "default name is anonymous"
    (is (= "Hello anonymous!" (-> {} default :greeting))))
  (testing "default adds Hello and !"
    (is (= "Hello Clojure!" (-> {:name "Clojure"} default :greeting)))))
