package org.example.streamsapi;

import org.example.data.StudentDataBase;

public class StreammatchExample {

    public static boolean  allMatch(){
       return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa()>=34.1);
    }

    public static boolean  anyMatch(){
        return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa()>=4.1);
    }


    public static void main(String[] args) {
        System.out.println(allMatch());

    }
}
