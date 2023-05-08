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
        personsTrousers.put(new Person("Zimmer", "Call"), new Trousers("jeans", "big star"));

        System.out.println(personsTrousers);
        printMyJeans(myJeans);
    }

    public static void printMyJeans(Map<String, Trousers> trousersMap) {
        System.out.println("Let's start with known keys");
        System.out.println("key=[my favorite jeans]" + trousersMap.get("My favorite jeans"));
        System.out.println("key=[Stupid key]" + trousersMap.get("stupid key"));

        System.out.println("================");

        System.out.println("Let's iterate the map");
//        Map.Entry represent key + value at once
        for (Map.Entry<String, Trousers> item : trousersMap.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());


        }

    }
}
