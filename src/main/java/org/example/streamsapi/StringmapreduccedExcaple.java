package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

public class StringmapreduccedExcaple {

    private static int noOfNotebooks(){
        int noOfNotrbook=StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel()>=3).filter(student -> student.getGender().equals("female")).map(Student::getNoteBooks).reduce(0,Integer::sum);

//                .reduce(0,(a,b)->a*b) for multiplication

        return noOfNotrbook;
    }

    public static void main(String[] args) {
        System.out.println(noOfNotebooks());

    }
}
