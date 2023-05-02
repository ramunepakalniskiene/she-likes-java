package com.sda.she_likes_java.common_behavior;

public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {

    }

    @Override
    public void go() {
        System.out.println("Bird's go()");
    }


}
