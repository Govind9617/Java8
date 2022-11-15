package org.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExcmple {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println("local date " + localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println("local date " + localTime);
        LocalDateTime localdateTime=LocalDateTime.now();
        System.out.println("local date " + localdateTime);
    }
}
