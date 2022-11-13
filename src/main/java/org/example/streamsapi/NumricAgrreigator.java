package org.example.streamsapi;

import java.util.stream.IntStream;

public class NumricAgrreigator {
    public static void main(String[] args) {
        Integer sum=IntStream.rangeClosed(1,50).sum();
        System.out.println(sum);
    }
}
