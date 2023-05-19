package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class HouseComparingByNumberOfTheFloors implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        int house1NumberOfFloors = o1.getNumberOfFloors();
        int house2NumberOfFloors = o2.getNumberOfFloors();
        return house1NumberOfFloors - house2NumberOfFloors;

    }
}
