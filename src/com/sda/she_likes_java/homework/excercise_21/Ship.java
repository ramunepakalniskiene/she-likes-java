package com.sda.she_likes_java.homework.excercise_21;

public class Ship extends Vehicle implements Floating {
    @Override
    public void Floating() {
        System.out.println("Ship is floating()");

    }

    @Override
    public void move() {
        System.out.println("Is moving() override from Vehicle");
    }
}
