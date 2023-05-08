package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = 5;
        System.out.println("are a equal b: " + (a == b));
        System.out.println("are a equal c: " + (a == c));

        String name1 = new String("mariusz");
        String name2 = new String("mariusz");
        System.out.println("name1 == name2: " + (name2 == name1));
        String name3 = name2;
        System.out.println("name3 == name2: " + (name2 == name3));


        Person first = new Person("Johan", "Geeris", 58);
        Person second = new Person("Johan", "Geeris", 58);
        System.out.println("are persons equal: " + (first == second));
        System.out.println("First person object is equal to second: " + (first.equals(second)));

    }
}
