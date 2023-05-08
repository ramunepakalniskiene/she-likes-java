package com.sda.she_likes_java.collections.map;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");

//        type of the key is String
//        type of the value is Trousers
        Map<String, Trousers> myJeans = new HashMap<>();
        myJeans.put("My favorite jeans", new Trousers("jeans", "Levis"));
        myJeans.put("My old one", new Trousers("unknown material", "Primark"));

        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("Ra", "P"), new Trousers("polish-material", "Pepco"));
        personsTrousers.put(new Person("Tomasz", "Markus"), new Trousers("jeans", "newyorker"));

        System.out.println(personsTrousers);
    }
}
