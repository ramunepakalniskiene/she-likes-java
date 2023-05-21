package com.sda.she_likes_java.homework.excercise_28;

import java.util.Comparator;

public class ComparatorTaskExternalSortingByCity implements Comparator<ComparatorTask> {
    @Override
    public int compare(ComparatorTask o1, ComparatorTask o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
