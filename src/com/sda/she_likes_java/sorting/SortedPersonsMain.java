package com.sda.she_likes_java.sorting;

import java.util.*;

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
        AgedReversedOrderOfSortedPerson reversedAgeOrder = new AgedReversedOrderOfSortedPerson();
        Collections.sort(persons, reversedAgeOrder);

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
        System.out.println("-------------------------");

        Collections.sort(persons, new ReversedLexicalOrderForSortedPerson().reversed().thenComparing(reversedAgeOrder));
        System.out.println(persons);

        Comparator<SortedPerson> reversedAgeOrderLambda = (o1, o2) -> {
            System.out.println("Using my AgedReverserOrderOfSortedPerson");
            if (o1.getAge() < o2.getAge()) {
                return 1;
            } else if (o1.getAge() > o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        };
        Comparable<SortedPerson> brokenComparableLambda = o -> 1;// there is only one object sos no possibility to compare it with some internal object its logically broken
    }

}
