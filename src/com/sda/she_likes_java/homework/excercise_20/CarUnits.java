package com.sda.she_likes_java.homework.excercise_20;

public class CarUnits {
    public static void saveCast(Car car) {
        if (car instanceof Mazda) {
            System.out.println("Mazda makes sound: " + ((Mazda) car).makeSound());
        } else if (car instanceof Toyota) {
            ((Toyota) car).playingNoisyMusic();
        } else {
            System.out.println("Different type of car");
        }
    }
}
