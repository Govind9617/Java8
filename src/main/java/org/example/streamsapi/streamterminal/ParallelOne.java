package org.example.streamsapi.streamterminal;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ParallelOne {

    public static List<String> sequencilyPrintStudentActivity(){
        long start=System.currentTimeMillis();
        List<String> sList= StudentDataBase.getAllStudents().stream().
                map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
        long end=System.currentTimeMillis();
        System.out.println("sequential "+ (end-start));
        return sList;
    }
    public static List<String> paralleyPrintStudentActivity(){
        long start=System.currentTimeMillis();
        List<String> sList= StudentDataBase.getAllStudents().stream().parallel().
                map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(toList());
        long end=System.currentTimeMillis();
        System.out.println("parallel "+ (end-start));

        return sList;

    }
    public static void main(String[] args) {
        sequencilyPrintStudentActivity();
        paralleyPrintStudentActivity();
        sequencilyPrintStudentActivity();
        paralleyPrintStudentActivity();



    }
}
