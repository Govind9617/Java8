package org.example.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreammMinMax {
    public static int findmaxvalue(List<Integer> integerList){
        return integerList.stream().reduce(0,(x,y)-> x>y ? x:y);
    }

//    public static Optional<Integer> findmaxvalueOptinal(List<Integer> integerList){
//        return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);
//    }
public static Optional<Integer> findMinValue(List<Integer> integerList){
    return Optional.of(integerList.stream().reduce(0, (x, y) -> x < y ? x : y));
}


    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,9,10);
        List<Integer> integerList1=new ArrayList<>();
        int maxValue=findmaxvalue(integerList1);
//        System.out.println(maxValue);

//        Optional<Integer> maxvalue=findmaxvalueOptinal(integerList1);
//        if(maxvalue.isPresent()){
//            System.out.println("max optional "+  maxvalue.get());
//
//        }else {
//            System.out.println("no max value");
//        }
        Optional<Integer> minValueOptional=findMinValue(integerList1);
        System.out.println("miv value+ "+ minValueOptional);
        if(minValueOptional.isPresent()){
            System.out.println("presenr min"+ minValueOptional);
        }else {
            System.out.println("no min value");
        }





    }
}
