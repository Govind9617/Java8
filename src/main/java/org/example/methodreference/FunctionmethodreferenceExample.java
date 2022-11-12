package org.example.methodreference;

import java.util.function.Function;

public class FunctionmethodreferenceExample {

    static Function<String,String>  toUpperCaseLamda=(s -> {
        return s.toUpperCase();
    });
    static Function<String,String>  toUpperCaseLamd=String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLamda.apply("java"));
        System.out.println(toUpperCaseLamd.apply("java"));
    }
}
