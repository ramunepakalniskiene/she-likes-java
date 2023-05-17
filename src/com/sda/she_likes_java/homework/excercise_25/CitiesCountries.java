package com.sda.she_likes_java.homework.excercise_25;

import java.util.*;

public class CitiesCountries {
    private Map<String, List<String>> citiesCountries;

    public CitiesCountries() {

    }

    public void getAllCountriesAndTheirCities(Map<String, List<String>> all) {
        for (Map.Entry<String, List<String>> allCitiesCountries : all.entrySet()) {
            System.out.println(allCitiesCountries);
        }
        System.out.println("-----------------------");
    }

    public void getCountries(Map<String, List<String>> citiesCountries) {
        for (Map.Entry<String, List<String>> allCitiesCountries : citiesCountries.entrySet()) {
            System.out.println("The countries are: " + allCitiesCountries.getKey());

        }
        System.out.println("-----------------------");

    }

    public void getCities(Map<String, List<String>> citiesCountries) {

        for (Map.Entry<String, List<String>> allCitiesCountries : citiesCountries.entrySet()) {
            System.out.println("The list of all cities is: " + allCitiesCountries.getValue());
        }

    }

}
