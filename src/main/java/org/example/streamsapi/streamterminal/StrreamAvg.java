package org.example.streamsapi.streamterminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StrreamAvg {
    public static int sum(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.
        summingInt(Student::getNoteBooks));
    }
    public static Double avgInt(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.
                averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(avgInt());

    }
}
