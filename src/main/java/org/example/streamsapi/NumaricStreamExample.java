package org.example.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumaricStreamExample {
    public static int sumOfNumber(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y)->x+y);// it convert Integer to int and cal
    }
    public static int sumOfNumberIntstream(){
        return IntStream.rangeClosed(0,8).sum();
    }
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("sum of Numbers "+ sumOfNumber(integerList));
        System.out.println("sum of Numbers "+ sumOfNumberIntstream());


    }
}
