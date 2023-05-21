package com.sda.she_likes_java.homework.excercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorTaskMain {
    public static void main(String[] args) {

        List<ComparatorTask> allObjects = new ArrayList<>();
        allObjects.add(new ComparatorTask("George", "Cloud", "Rome", "Italy"));
        allObjects.add(new ComparatorTask("Simon", "Smith", "London", "United_Kingdom"));
        allObjects.add(new ComparatorTask("Melissa", "Oprah", "Paris", "France"));
        allObjects.add(new ComparatorTask("Rose", "Clunky", "Milan", "Italy"));
        allObjects.add(new ComparatorTask("Jean", "Hopkins", "Madrid", "Spain"));
        allObjects.add(new ComparatorTask("Marcus", "Hills", "Lisbon", "Portuguese"));
        allObjects.add(new ComparatorTask("Oscar", "Fliers", "Reykjavik", "Iceland"));
        allObjects.add(new ComparatorTask("Adam", "Hopkins", "Rotterdam", "Netherlands"));

        Collections.sort(allObjects, new ComparatorTaskExternalSortingByCity());
        System.out.println("External Comparable usage allObjects sorted by city: " + allObjects);

        Collections.sort(allObjects, new ComparatorTaskExternalSortingByCity().reversed().thenComparing(ComparatorTask::getCountry));
        System.out.println(allObjects);

        Collections.sort(allObjects, new ComparatorTaskExternalSortingByCity().thenComparing(ComparatorTask::getName));
        System.out.println(allObjects);
    }
}
