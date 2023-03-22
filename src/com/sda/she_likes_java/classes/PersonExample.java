package com.sda.she_likes_java.classes;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's use ou newly created class Person");

        // int is primitive variable
        int number = 1;
        // me is object variable
        // me is reference to an object
        Person me = new Person();
        me.name="Ramune";
        Person you = new Person();
        you.name="Mariusz";
        System.out.println("My name currently is: " + me.name);
        System.out.println("You name currently is: " + you.name);
    }

}
