package org.example.funtionalinterface;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PreStudentExa {

    static Predicate<Student> p1=(s)-> s.getGradeLevel()>=3;
    static Predicate<Student> p2=(s)-> s.getGpa()>=3.9;

    public static void filterBygrade(){
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {if(p1.test(student)){System.out.println(student);}});

    }
    public static void filterByGpa(){
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {if(p2.test(student)){System.out.println(student);}});

    }
    public static void filterByGradeAndGpa(){
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(student -> {if(p1.or(p2).negate().test(student)){System.out.println(student);}});

    }

    public static void main(String[] args) {
      //  filterBygrade();
     //   filterByGpa();
        filterByGradeAndGpa();
    }
}
