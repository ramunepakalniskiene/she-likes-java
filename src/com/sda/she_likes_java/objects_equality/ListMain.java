package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List personList = new ArrayList();
        Person me = new Person("Ra", "Pkln", 40);
        Person me2 = new Person("Rad", "Pkln", 11);
        Person otherOne = new Person("Vit", "Pkln", 40);
        personList.add(me);
        personList.add(me2);
        personList.add(otherOne);
        personList.add(new Car("BLUE"));

        System.out.println(personList);

        System.out.println("Deleting 2nd object from the list  ");
        System.out.println("Person from list: " + personList.get(1));
        System.out.println("Try to get person out of list");
        System.out.println("person from list: " + personList.get(1));
        Person personFromList = (Person) personList.get(1);
        Object fromPosition0 = personList.get(0);
        System.out.println("age of the person fromPosition0: " + ((Person) fromPosition0).getAge());

        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);
        System.out.println("-----------");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
//        cars.add(me);
        cars.add(new Car("green"));
        cars.add(new Car("yellow"));
        System.out.println(" Get car index 2: " + cars.get(2));

    }
}
