package com.sda.she_likes_java.homework.excercise_27;

import java.util.Comparator;

public class MyDateComparingByYear implements Comparator<MyDate> {
    @Override
    public int compare(MyDate o1, MyDate o2) {
        return o1.getYear() - o2.getYear();
    }
}
