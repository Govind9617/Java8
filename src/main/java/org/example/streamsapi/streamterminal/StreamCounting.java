package org.example.streamsapi.streamterminal;

import org.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamCounting {
    public static long count(){
        return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa()>=3.9).collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(count());

    }
}
