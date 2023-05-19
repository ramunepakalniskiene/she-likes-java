package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HouseProgram {
    public static void main(String[] args) {
        List<House> myHouses = new ArrayList<>();
        myHouses.add(new House(10, 2, 5, "Spain"));
        myHouses.add(new House(5, 1, 2, "Greece"));
        myHouses.add(new House(3, 1, 1, "Italy"));
        myHouses.add(new House(2, 2, 2, "Netherlands"));

        Collections.sort(myHouses);
        System.out.println("Sorted by natural way " + myHouses);

        Collections.sort(myHouses, new HouseComparingByCountry());
        System.out.println("Sorted by country " + myHouses);

        Collections.sort(myHouses, new HouseComparingByNumberOfTheFloors());
        System.out.println("Sorted by number of floors " + myHouses);

        HouseComparingByNumberOfTheFloors comparingByNumberOfTheFloors = new HouseComparingByNumberOfTheFloors();
        HouseComparingByCountry houseComparingByCountry = new HouseComparingByCountry();

        Collections.sort(myHouses, comparingByNumberOfTheFloors.reversed().thenComparing(houseComparingByCountry));
        System.out.println("Sorted by floors then by country " + myHouses);
    }
}
