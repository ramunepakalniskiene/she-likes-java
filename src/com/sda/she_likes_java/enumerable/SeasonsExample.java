package com.sda.she_likes_java.enumerable;

import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        Seasons myFavoriteOne = Seasons.WINTER;
        System.out.println("Average temperature during winter is: " + myFavoriteOne.getAverageTemperature());
        System.out.println("Winter's activity: " + myFavoriteOne.getActivity());
        myFavoriteOne.setActivity("skiing");
        System.out.println("Winter's activity: " + myFavoriteOne.getActivity());

        // after update of constructor


        Seasons notSoFavorite = Seasons.AUTUMN;
        System.out.println(notSoFavorite);
        System.out.println("Autumn's activity: " + notSoFavorite.getActivity());

        List<Seasons> allSeasons = List.of(
                Seasons.WINTER,
                Seasons.SPRING,
                Seasons.AUTUMN,
                Seasons.SUMMER);
        System.out.println(allSeasons);
    }
}
