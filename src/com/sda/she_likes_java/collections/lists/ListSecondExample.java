package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Person;

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

        System.out.println("Let's play with names");
        List<Person> personList = List.of(
                new Person("Marcus", "Mol"),
                new Person("Tom", "Gell"),
                new Person("Marcus", "Mol"),
                new Person("Orca", "Fin"),
                new Person("Rod", "Foo"),
                new Person("Marcus", "Mol")

        );
        List<Person> foundPersons = findPersonsByName(personList, "Marcus");
        System.out.println("Persons with name Macus " + foundPersons);
        foundPersons = findPersonsByName(personList, "Olaf");
        System.out.println("Persons with name Olaf " + foundPersons);

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

    public static List<Person> findPersonsByName(List<Person> persons, String nameToFind) {
//        create empty result
        List<Person> result = new ArrayList<>();

//        iterate through the list
        for (Person person : persons) {
            //        if person has proper name add to the list
            if (person.getName().equals(nameToFind)) {
                result.add(person);
            }
        }

//        return result;
        return result;

    }
}
