package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.util.Comparator;

public class ComparatorPupil implements Comparator<Pupil> {
    @Override
    public int compare(Pupil o1, Pupil o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}

