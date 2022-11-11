package org.example.funtionalinterface;

import java.util.function.Predicate;

public class PredicatExample {
    static Predicate<Integer> p=(i)->{return i%2==0;};
    static Predicate<Integer> p1=(i)-> i%2==0;
    static Predicate<Integer> p2=(i)-> i%5==0;

    static void pridicateAnd(){
        System.out.println(p1.and(p2).test(1));
    }
    static void pridicateOr(){
        System.out.println(p1.or(p2).test(9));
    }
    static void pridicateNegate(){
        System.out.println(p1.or(p2).negate().test(10));
    }


    public static void main(String[] args) {

//        System.out.println(p.test(9));
//        pridicateAnd();
//        pridicateOr();
        pridicateNegate();
    }
}
