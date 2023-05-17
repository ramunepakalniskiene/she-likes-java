package com.sda.she_likes_java.homework.excercise_25;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        CitiesCountries allCitiesCountries = new CitiesCountries();

        Map<String, List<String>> citiesCountries = new HashMap<>();
        citiesCountries.put("USA", List.of("NewYork", "Washington", "Los Angeles"));
        citiesCountries.put("Canada", List.of("Toronto", "Ottawa", "Victoria"));
        citiesCountries.put("Mexico", List.of("Mexico", "Oaxaca", "Cancun"));
        citiesCountries.put("Brazil", List.of("Rio de Janeiro", "Sao Paulo", "Brasilia"));
        citiesCountries.put("Argentina", List.of("Buenos Aires", "Mar del Plata", "Rosario"));


        allCitiesCountries.getAllCountriesAndTheirCities(citiesCountries);
        allCitiesCountries.getCities(citiesCountries);
        allCitiesCountries.getCountries(citiesCountries);


    }
}
