package com.sda.she_likes_java.visibility.private_modifier.cars;

public class Main {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        // myNewCar.brand - not possible to access, because brand variable is PRIVATE
        myNewCar.model ="Mercedes";
        myNewCar.colour="Silver";
    }
}
