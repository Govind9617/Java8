package org.example.funtionalinterface;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer1=(student)-> System.out.println(student);
    static Consumer<Student> consumer2=(student)-> System.out.println(student.getName());
    static Consumer<Student> consumer3=(student)-> System.out.println(student.getActivities());
    public static void printStudents(){

        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach(consumer1);
    }

    public static void printNameAndActivies(){

        List<Student>  studentList=StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3) {
                consumer2.andThen(consumer3).accept(student);

            }
        }));
    }
    public static void main(String[] args) {
//        Consumer<String> consumer=(s)-> System.out.println(s.toUpperCase());
//        consumer.accept("java");
        printStudents();
        printNameAndActivies();
    }
}
