package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptinalOrElse {
public static String optinalOrElse(){
    Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
  //  Optional<Student> optionalStudent=Optional.ofNullable(null);

    String s=optionalStudent.map(Student::getName).orElse("default");
    return s;
}
    public static String optinalOrElseGet(){
        //Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
         Optional<Student> optionalStudent=Optional.ofNullable(null);

        String s=optionalStudent.map(Student::getName).orElseGet(()->"Default");
        return s;
    }
    public static String optinalOrElseThrow(){
        //Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent=Optional.ofNullable(null);

        String s=optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No data"));
        return s;
    }
    public static void main(String[] args) {
        System.out.println(optinalOrElseThrow());

    }
}
