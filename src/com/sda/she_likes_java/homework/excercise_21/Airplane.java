package com.sda.she_likes_java.homework.excercise_21;

public class Airplane extends Vehicle implements Flying {
    @Override
    public void Flying() {
        System.out.println("Airplane is flying()");

    }

    @Override
    public void move() {
        System.out.println("Is moving() override from Vehicle");
    }
}
