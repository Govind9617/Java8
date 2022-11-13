package org.example.streamsapi.streamterminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class StreamgroupingBy {
    public static void groupStudentsBtgender() {
        Map<String, List<Student>> stringListMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
        System.out.println(stringListMap);

    }

    public static void customgroupStudentsBtgender() {
        Map<String, List<Student>> stringListMap1 = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "outstandin" : "average"));
        System.out.println(stringListMap1);

    }

    public static void twolevelGroupin_1() {
        Map<Integer, Map<String, List<Student>>> map = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "outstandin" : "average")));
        System.out.println(map);
    }

    public static void twolevelGroupin_2() {
        Map<String, Integer> map = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(map);
    }

    public static void threeGroup() {
        LinkedHashMap<String, Set<Student>> stringsetLinkedHashMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println(stringsetLinkedHashMap);
    }

    public static void caolucateTopGpa() {
        Map<Integer, Optional<Student>> map = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
//        System.out.println(map);
        Map<Integer, Student> map1 = StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)
                       ));
        System.out.println(map1);
    }


    public static void main(String[] args) {
//        customgroupStudentsBtgender();
//        twolevelGroupin_1();
//        twolevelGroupin_2();
//        threeGroup();
        caolucateTopGpa();

    }

}
