package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Catherine");
        names.add("Tom");
        names.add("Inese");
        names.add("Agnese");
        names.add(4, "Ilga");
        List<String> anotherList = names;

        printNames(names);
        printOnlySomeNames(names);
        printNamesWithSemicolon(names);
        System.out.println("Let's add some names in a list: ");
        addName(names);
        printNames(names);
        printNames(anotherList);

    }

    public static void printNames(List<String> names) { //static means you can call method without creating an object
        System.out.println("The list " + names);
        for (String singlename : names) {
            System.out.println("The names are: " + singlename);
        }
    }

    public static void printOnlySomeNames(List<String> names) {
        // starting from index 1 - second position in array
        for (int i = 1; i < names.size(); i++) {
            System.out.println("Names are 2nd option: " + names.get(i));

        }
    }

    public static void printNamesWithSemicolon(List<String> names) {
        String result = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            result += "; " + names.get(i);

        }
        System.out.println(result);
    }

    // add name
    public static void addName(List<String> stringList) {
        stringList.add("Kitija");

    }
}
