package com.sda.she_likes_java.lambda;
// Vlasses from java.lang are imported always
// API - Application programming interface
// contract - what to do
@FunctionalInterface
public interface Jogging {

    void run();

    // simple / default implementation
    default void walk() {
    }

    default void drink(String drink) {
    }
}
