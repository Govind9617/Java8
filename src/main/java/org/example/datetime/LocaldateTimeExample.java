package org.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocaldateTimeExample {
    public static void main(String[] args) {
       LocalDateTime localDateTime= LocalDateTime.now();
//        System.out.println(localDateTime);

         LocalDateTime localDateTime1=LocalDateTime.of(2018,3,5,4,54,6,93850);
//        System.out.println(localDateTime1);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getNano());
        System.out.println(localDateTime.getDayOfYear());
    }
}
