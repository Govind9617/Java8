package org.example.streamsapi.streamterminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoinung {
    public static String joining_1(){
      return   StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
    }
    public static String joining_2(){
        return   StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
    }
    public static String joining_3(){
        return   StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-","(",")"));
    }


    public static void main(String[] args) {
        System.out.println(joining_1());
        System.out.println(joining_2());
        System.out.println(joining_3());


    }
}
