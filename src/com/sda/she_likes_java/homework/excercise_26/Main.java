package com.sda.she_likes_java.homework.excercise_26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImportantEvents[] myEvents = ImportantEvents.values();

        for (ImportantEvents event : myEvents) {
            System.out.println("Important event: ");
            System.out.println("\t" + event.getDate() + ": " + event.getDescription());


        }
    }
}






