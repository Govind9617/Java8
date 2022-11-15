package org.example.datetime;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1=LocalDate.of(2018,07,21);
        System.out.println(localDate1);
        LocalDate localDate2=LocalDate.ofYearDay(2020,77);
        System.out.println(localDate2);
        System.out.println("check "+ localDate.plusWeeks(8));

    }
}
