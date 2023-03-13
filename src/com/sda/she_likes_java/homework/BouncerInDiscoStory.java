package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good evening, how old are you?");

        int age = scanner.nextInt();
        System.out.println("What is your height?");
        double height = scanner.nextDouble();

        System.out.println("Are you able to sing well?");
        boolean ableToSingWell;
        ableToSingWell = scanner.nextBoolean();


        boolean youngBouncer = age >= 18 && height >= 1.71 && ableToSingWell;


        if (youngBouncer) {
            System.out.println("Young:Please proceed to the dancing hall");

        } else {
            System.out.println("Young: go home");
            boolean oldBouncer = age >= 18 || height > 1.71 || ableToSingWell;
            if (oldBouncer) {
                System.out.println("Old: Go quickly to the disco");
            } else {
                System.out.println(":( :( :(");


            }
        }
    }
}
