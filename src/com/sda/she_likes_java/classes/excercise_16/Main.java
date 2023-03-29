package com.sda.she_likes_java.classes.excercise_16;

public class Main {
    public static void main(String[] args) {
        Owner owner=new Owner("Roger", "Freeman",new Animal());
        Animal dog=new Animal("Rex", 4,"terrier");

        System.out.println(owner);
        System.out.println(dog);
    }
}
