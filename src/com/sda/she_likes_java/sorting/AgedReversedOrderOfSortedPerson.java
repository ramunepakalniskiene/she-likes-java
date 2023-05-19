package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class AgedReversedOrderOfSortedPerson implements Comparator<SortedPerson> {

    @Override
    public int compare(SortedPerson o1, SortedPerson o2) {
//        return o2.getAge() - o1.getAge();
        System.out.println("Using my AgedReverserOrderOfSortedPerson");
        if (o1.getAge() < o2.getAge()) {
            return 1;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

