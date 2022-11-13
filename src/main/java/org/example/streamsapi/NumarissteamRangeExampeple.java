package org.example.streamsapi;

import java.util.stream.IntStream;

public class NumarissteamRangeExampeple {
    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,50);
        System.out.println(intStream.count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.println(value+ ","));
    }

}
