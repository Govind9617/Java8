package org.example.contructorrefrence;

import org.example.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorRefrence {
    static Supplier<Student> studentSupplie1=Student::new;

    static Function<String,Student> studentFunction=Student::new;
    public static void main(String[] args) {
    System.out.println(studentSupplie1.get());
        System.out.println(studentFunction.apply("java"));
    }
}
