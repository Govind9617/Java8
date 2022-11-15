package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptinalFlatmap {

    public static void optinalFilter(){
        Optional<Student> optional=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        optional.filter(student -> student.getGpa()>=4.9).ifPresent(student -> System.out.println(student));
    }
    public static void optinalMapr(){
        Optional<Student> optional=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(optional.isPresent()){
            optional.filter(student -> student.getGpa()>=9).map(Student::getName);
            System.out.println(optional.get());
        }
    }
    public static void main(String[] args) {
//        optinalFilter();
        optinalMapr();

    }
}
