package com.sda.she_likes_java.polymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    @Override
    public void move() {
        System.out.println("Jumping, jumping");
    }

    public void sleep() {
        System.out.println("Rrrrrr-rrrrr is sleeping");
    }
}
