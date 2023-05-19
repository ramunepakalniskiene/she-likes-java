package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortedPersonsMain {
    public static void main(String[] args) {

        SortedPerson olga = new SortedPerson("Olga", 40);
        SortedPerson olaf = new SortedPerson("Olaf", 25);
        SortedPerson rasmus = new SortedPerson("Rasmus", 38);


        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(olga);
        persons.add(rasmus);

        System.out.println("List before sorting" + persons);
        System.out.println("comparing 40 to 25: " + olga.compareTo(olaf));
        System.out.println("comparing 25 to 38: " + olaf.compareTo(rasmus));

        Collections.sort(persons);

        System.out.println("sorted list of objects based on the age " + persons);
        System.out.println("---------------");
//        AgedReversedOrderOfSortedPerson reversedAgeOrder = new AgedReversedOrderOfSortedPerson();
        Collections.sort(persons, new AgedReversedOrderOfSortedPerson());
        System.out.println("reversed order :" + persons);
        System.out.println("---------------------------");

        List<String> names = new ArrayList<>();
        names.add("Ramune");
        names.add("Lina");
        names.add("Alma");
        names.add("Karolina");

        Collections.sort(names);
        System.out.println("Sorted names (String sorting): " + names);
        System.out.println("------------");

        Collections.sort(persons, new LexicalOrderForSortedPerson());
        System.out.println(persons);
        System.out.println("----------------------");

        Collections.sort(persons, new ReversedLexicalOrderForSortedPerson());
        System.out.println(persons);


    }

}
