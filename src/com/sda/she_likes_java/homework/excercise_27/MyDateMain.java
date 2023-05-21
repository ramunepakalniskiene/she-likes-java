package com.sda.she_likes_java.homework.excercise_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate birthday = new MyDate(1982, 12, 28);
        MyDate endOfPrimarySchool = new MyDate(1993, 5, 31);
        MyDate endOfUniversity = new MyDate(2005, 6, 20);
        MyDate firstJob = new MyDate(2005, 4, 26);

        List<MyDate> myImportantDates = new ArrayList<>();
        myImportantDates.add(birthday);
        myImportantDates.add(endOfPrimarySchool);
        myImportantDates.add(endOfUniversity);
        myImportantDates.add(firstJob);

        Collections.sort(myImportantDates);
        System.out.println("Sorting by MONTH from MyDate class: " + myImportantDates);
        System.out.println("=================");

        Collections.sort(myImportantDates, new MyDateComparingByDay());
        System.out.println("External sorting by the DAY: " + myImportantDates);

        Collections.sort(myImportantDates, new MyDateComparingByDay().reversed());
        System.out.println("External sorting.reversed() by the DAY: " + myImportantDates);
        System.out.println("====================");
        MyDateComparingByYear byYear = new MyDateComparingByYear();

        Collections.sort(myImportantDates, byYear);
        System.out.println("External sorting by the YEAR: " + myImportantDates);

        Collections.sort(myImportantDates, new MyDateComparingByYear().reversed());
        System.out.println("External sorting.reversed() by the YEAR: " + myImportantDates);
        System.out.println("====================");

        Collections.sort(myImportantDates, new MyDateComparingByDay().reversed().thenComparing(byYear));
        System.out.println("External sorting bay DAY.reversed() and then by YEAR " + myImportantDates);
    }
}
