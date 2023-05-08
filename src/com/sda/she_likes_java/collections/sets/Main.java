package com.sda.she_likes_java.collections.sets;

import com.sda.she_likes_java.collections.Trousers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sets are designed to store unique items");

        Set<Trousers> uniqueTrousers = new HashSet<>();
        uniqueTrousers.add(new Trousers("jeans", "Levis"));
        uniqueTrousers.add(new Trousers("jeans", "Levis"));
        uniqueTrousers.add(new Trousers("jeans", "Levis"));
        uniqueTrousers.add(new Trousers("jeans", "Levis"));
        uniqueTrousers.add(new Trousers("jeans", "Big star"));

        System.out.println("Size of the set is: " + uniqueTrousers.size());
        System.out.println("set of my trousers: " + uniqueTrousers);

        List<Trousers> trousersList = List.of(
                new Trousers("jeans", "Leviiis"),
                new Trousers("jeans", "Biggg-star"),
                new Trousers("jeans", "Newyorker"),
                new Trousers("jeans", "Leviiis")
        );
        Set<Trousers> anotherSet = new HashSet<>(trousersList);
        System.out.println("Let's check if my last had some duplicates");
        System.out.println(trousersList.size() == anotherSet.size());

    }
}
