package org.example.funtionalinterface;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerexa {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + ":" + activities);
    Consumer<Student> consumer = (student -> {
        if (p1.or(p2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });
    public void printNameAndActivities(List<Student> students) {
        students.forEach(consumer);

    }

    public static void main(String[] args) {

        List<Student> studentList= StudentDataBase.getAllStudents();
             new PredicateConsumerexa().printNameAndActivities(studentList);

    }
}
