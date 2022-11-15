package org.example.optional;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;

public class OptinalExample {

    public static String getstudentName(){
        Student student=StudentDataBase.studentSupplier.get();
        if(student!=null){
            return student.getName();
        }
        return null;

    }
    public static Optional<String> getstudentNameOptinal(){
        Optional<Student> optional=Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optional1=Optional.ofNullable(null);
       if (optional1.isPresent()){
           return  optional.map(Student::getName);
       }
       return Optional.empty();
    }
    public static void main(String[] args) {
//        String s=getstudentName();
//        if(s!=null){
//            System.out.println(s.length());
//        }else{
//            System.out.println("name not fount");
//        }
        Optional<String> optional=getstudentNameOptinal();
        if(optional.isPresent()){
            System.out.println(optional.get().length());
        }else {
            System.out.println("empty");
        }


    }
}
