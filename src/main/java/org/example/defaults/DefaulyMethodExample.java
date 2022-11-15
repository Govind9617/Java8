package org.example.defaults;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaulyMethodExample {

    static Consumer<Student> consumer=(student -> System.out.println(student));

    public static void sortNyNmae(List<Student> studentlist){
        System.out.println("after");
      Comparator<Student> consumer1= Comparator.comparing(Student::getName);
      studentlist.sort(consumer1);
        System.out.println(studentlist);

    }


    public static void main(String[] args) {

      List<Student> list= StudentDataBase.getAllStudents();
//        System.out.println(list);
        System.out.println("befor");
        list.forEach(consumer);
        sortNyNmae(list);

    }
}
