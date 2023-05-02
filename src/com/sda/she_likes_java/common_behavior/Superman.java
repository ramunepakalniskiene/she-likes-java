package com.sda.she_likes_java.common_behavior;

public class Superman implements Flyable, Swimable, Movable {
    @Override
    public void fly() {
        System.out.println("Superman is flying");

    }

    @Override
    public void swim() {
        System.out.println("Superman is simple swimmer");

    }

    @Override
    public void move() {
        System.out.println("Superman is very movable");
    }
}
