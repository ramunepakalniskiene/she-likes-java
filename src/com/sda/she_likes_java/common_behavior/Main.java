package com.sda.she_likes_java.common_behavior;

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

        Swimable tiger2 = (Swimable) tiger;
        Swimable swimmableTiger = new Tiger();

        Superman superSuperMan = new Superman();
        Swimable superManSwim = superSuperMan;
        Flyable superManFly = superSuperMan;

//        Tiger assigment ways
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimable swimmableTiger2 = new Tiger();
        swimmableTiger2.swim();
        Object objectTiger = new Tiger();
        // cannot call go() and swim() - thery are not visible here

    }
}
