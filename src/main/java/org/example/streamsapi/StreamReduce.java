package org.example.streamsapi;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static int performMultiplification(List<Integer> list){
        return list.stream().reduce(3,(a,b)->a*b);

    }
//    public static Optional<Student> getHighestGpa(){
//        StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{if(s1.getGpa()> s2.getGpa()){
//            return s1;}else {
//            return s2;
//        }
//        }});
//    }
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,3,4,5);
        System.out.println(performMultiplification(list));

    }
}
