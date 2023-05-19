package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class LexicalOrderForSortedPerson implements Comparator<SortedPerson> {


    @Override
    public int compare(SortedPerson o1, SortedPerson o2) {
//        String name1 = o1.getName();
//        String name2 = o2.getName();
        return o1.getName().compareTo(o2.getName());
//        return -name1.compareTo(name2);
    }
}

