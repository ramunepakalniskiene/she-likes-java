package com.sda.she_likes_java.collections.map.maps_practice;


import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Student, LessonJournal> mainList = new HashMap<>();
        mainList.put(new Student("Arthur", "Falk"), new LessonJournal("Biology", 5));
        mainList.put(new Student("Rose", "Meyer"), new LessonJournal("Biology", 10));
        mainList.put(new Student("Melanie", "Frank"), new LessonJournal("Biology", 5));
        mainList.put(new Student("Oskar", "Flu"), new LessonJournal("Biology", 3));
        System.out.println(mainList);
        printMapKey(mainList);
        printMapValue(mainList);
    }


    public static void printMapKey(Map<Student, LessonJournal> allData) {
        for (Map.Entry<Student, LessonJournal> allValues : allData.entrySet()) {
            System.out.println("The pupils are: " + allValues.getKey());

        }
    }

    public static void printMapValue(Map<Student, LessonJournal> allData) {
        for (Map.Entry<Student, LessonJournal> allValues : allData.entrySet()) {
            System.out.println("The subjects + cabinets are:" + allValues.getValue());
        }
    }


}

