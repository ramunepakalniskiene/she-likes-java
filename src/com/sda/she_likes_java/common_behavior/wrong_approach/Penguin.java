package com.sda.she_likes_java.common_behavior.wrong_approach;

public class Penguin extends Bird implements Swimable {

    @Override
    public void swim() {
        System.out.println("Penguins are excellent swimmers");

    }
}
