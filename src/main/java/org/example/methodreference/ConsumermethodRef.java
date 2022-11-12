package org.example.methodreference;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumermethodRef {

    static Consumer<Student> consumer1= System.out::println;
    static Consumer<Student> consumer2=Student::printListOfActivities;


    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer2);

    }
}
