package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamCompatorExcample {

    public static List<Student> sortStudentByNAme(){
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        sortStudentByNAme().forEach(System.out::println);

    }
}
