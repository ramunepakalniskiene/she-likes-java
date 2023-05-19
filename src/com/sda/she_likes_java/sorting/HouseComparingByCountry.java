package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class HouseComparingByCountry implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
