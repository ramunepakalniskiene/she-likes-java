package com.sda.she_likes_java.common_behavior.wrong_approach;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Bird();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyibleParrot = new Parrot();
    }
}
