package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeAndDate {
    public static void main(String[] args) {
        LocalDate currentDate= LocalDate.now();
        System.out.println("Current date is: "+ currentDate);

        System.out.println("Current year is: " + currentDate.getYear());
        System.out.println("Current month is: " + currentDate.getMonth());
        System.out.println("Current day is: " + currentDate.getDayOfMonth());
        System.out.println("Current day of the week is:  " + currentDate.getDayOfWeek());
        System.out.println("Current era is: " + currentDate.getEra());

        System.out.println("---------");

        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current date and time in my location is " + currentDateAndTime);

        System.out.println("Let's format  a little bit our date and time");
        System.out.println(currentDateAndTime.format(DateTimeFormatter.BASIC_ISO_DATE));

//      Do not use Date clas it is - deprecated Date date = new Date();
        LocalDate now = LocalDate.now();
        LocalDate future = now.plus(5, ChronoUnit.DAYS);
        System.out.println(now);
        System.out.println(future);
        LocalDate previousYear = now.minusYears(1);
        System.out.println(previousYear);
        Boolean isBefore = previousYear.isBefore(now);
        System.out.println(isBefore);

    }
}
