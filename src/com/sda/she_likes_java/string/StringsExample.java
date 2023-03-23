package com.sda.she_likes_java.string;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Ramune ";
        String surname = "Pakalniskiene";
        String profession = ". I am a Manager";
        int age = 40;

        System.out.println("Hi, I am " + name.concat(surname).concat(profession) + ". I am "+ age + " years old");
        System.out.printf("Hi, I'm %s %s %s. I am %s years old.%n",name, surname, profession, age);
        System.out.printf("Hi, I'm %s %s %s. I am %s years old.%n", name, surname, profession, age);
    }
}
