package org.example.funtionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOparatorExample {
    static UnaryOperator<String> unaryOperator=(s -> s.concat("default"));
    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("java"));

    }
}
