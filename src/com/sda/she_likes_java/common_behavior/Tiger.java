package com.sda.she_likes_java.common_behavior;

public class Tiger extends Animal implements Swimable {
    @Override
    public void go() {
        System.out.println("Tiger's go()");
    }

    @Override
    public void swim() {
        System.out.println("Tiger can swim!");

    }
}
