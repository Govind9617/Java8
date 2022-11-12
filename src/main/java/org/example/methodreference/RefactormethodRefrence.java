package org.example.methodreference;

import org.example.data.Student;

import java.util.function.Predicate;

public class RefactormethodRefrence {
    static Predicate<Student> p1=(s)-> s.getGradeLevel()>=3;
    static Predicate<Student> p2=(s)-> s.getGpa()>=3.9;

    public static void main(String[] args) {

    }
}
