package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {

    public static List<String> printStudentActivity(){
        List<String> sList=StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
    return sList;
    }

    public static Long countStudentActivity(){
        Long sList=StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().count();
        return sList;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivity());
        System.out.println(countStudentActivity());

    }
}
