package com.sda.she_likes_java.time_and_date;

import java.time.LocalDate;
import java.time.LocalDateTime;

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

        LocalDateTime currentDateAndTime= LocalDateTime.now();
        System.out.println("Current date and time in my location is " + currentDateAndTime);
    }
}
