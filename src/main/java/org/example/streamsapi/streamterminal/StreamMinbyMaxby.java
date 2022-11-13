package org.example.streamsapi.streamterminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinbyMaxby {
    public static Optional<Student> minBy_Example(){
        return StudentDataBase.getAllStudents().stream().collect(minBy(Comparator.comparing(Student::getGpa)));
    }
    public static Optional<Student> maxBy_Example(){
        return StudentDataBase.getAllStudents().stream().collect(maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(minBy_Example());
        System.out.println(maxBy_Example());

    }
}
