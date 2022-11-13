package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    static Predicate<Student> predicate=Student-> Student.getGradeLevel()>=3;
    static Predicate<Student> predicateGpa=Student-> Student.getGradeLevel()>=3.9;
    public static void main(String[] args) {
        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream().
                filter(predicate).filter(predicateGpa).
                collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(stringListMap);
    }
}
