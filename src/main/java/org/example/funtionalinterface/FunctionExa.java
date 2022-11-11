package org.example.funtionalinterface;

import java.sql.DriverManager;
import java.util.function.Function;

public class FunctionExa {

    static Function<String,String> function=(name)->name.toUpperCase();
    static Function<String,String> addSomeString=(name)->name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("resulr is :"+ function.apply("java"));
        System.out.println("resulr is :"+ function.andThen(addSomeString).andThen(addSomeString).compose(addSomeString).apply("java"));
        System.out.println("resulr is :"+ function.compose(addSomeString).apply("java"));

    }
}
