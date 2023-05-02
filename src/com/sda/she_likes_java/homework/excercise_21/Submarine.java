package com.sda.she_likes_java.homework.excercise_21;

public class Submarine extends Vehicle implements Diving {
    @Override
    public void Diving() {
        System.out.println("Submarine is diving()");

    }

    @Override
    public void move() {
        System.out.println("Is moving() override from Vehicle");
    }
}
