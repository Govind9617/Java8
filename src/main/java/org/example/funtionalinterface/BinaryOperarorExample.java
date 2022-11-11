package org.example.funtionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperarorExample {

    static Comparator<Integer>  comparator=(a,b)->a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator=((integer, integer2) -> integer*integer2);
        System.out.println(binaryOperator.apply(2,5));
        BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(2,5));

    }
}
