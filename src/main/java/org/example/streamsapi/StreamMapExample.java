package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamMapExample {

    public static List<String> namesList(){
        List<String> studentList= StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).
                collect(toList());
        return studentList;
    }

    public static Set<String> namesSet(){
        Set<String> studentList= StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase).
                collect(Collectors.toSet());
        return studentList;
    }
    public static void main(String[] args) {
//        System.out.println(namesList());
        System.out.println(namesSet());

    }
}
