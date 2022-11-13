package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Optional;
import java.util.function.DoubleToIntFunction;

public class StreamFind {

    public static Optional<Student> findAnyStudent(){
      return  StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=8).findAny();
    }
    public static Optional<Student> findFirstStudent(){
        return  StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=4).findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> optionalStudent=findFirstStudent();
        if(optionalStudent.isPresent()){
            System.out.println("found student "+ optionalStudent.get());
        }else {
            System.out.println("studen not found");
        }

    }
}
