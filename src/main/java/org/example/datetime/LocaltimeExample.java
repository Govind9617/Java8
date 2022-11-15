package org.example.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocaltimeExample {


    public static void main(String[] args) {

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1=LocalTime.of(23,23);
        System.out.println(localTime1);
        LocalTime localTime12=LocalTime.of(23,23,23);
        System.out.println(localTime12);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println("chrono "+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println("chrono "+localTime.toSecondOfDay());

    }
}
