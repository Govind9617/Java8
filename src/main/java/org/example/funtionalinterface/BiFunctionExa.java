package org.example.funtionalinterface;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExa {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction=((students, studentPredicate) -> {
        Map<String, Double> map=new HashMap<>();
        students.forEach(student -> {
            if(studentPredicate.test(student)){map.put(student.getName(),student.getGpa());}
        });
        return  map;
    });
    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PreStudentExa.p1));

    }
}
