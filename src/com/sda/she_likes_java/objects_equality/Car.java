package com.sda.she_likes_java.objects_equality;

public class Car {
    public String colour;

    public Car(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
