package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryFunctions {
    public static void main(String[] args) {


        Scanner inputReader = new Scanner(System.in);
//        System.out.println("How old are you?");
//        int age = inputReader.nextInt();
//
//        System.out.println("What is your height?");
//        double height = inputReader.nextDouble();
//
//        System.out.println("Are you able to sing well?");
//        boolean ableToSingWell = inputReader.nextBoolean();

        boolean youngBouncer = checkedByYoungBouncer(19, 175, false);

        if (youngBouncer) {
            System.out.println("Well come to the best disco in the world!");
        } else {
            System.out.println("Sorry, come back next year");
            System.out.println();
            System.out.println("Wait I'll try old bouncer");
            System.out.println();
            boolean oldBouncer = checkedByOldBouncer(19,1,true);
            if (oldBouncer) {
                System.out.println("OldBouncer: WELCOME TO THE DISCO!!");
            } else {
                System.out.println("SORRY, NO CHANCE!");
            }
        }
    }
    public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell){
        boolean youngBouncer = age >= 18 && height >= 1.71 && isAbleToSingWell;
        return youngBouncer;
    }
    public static boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell){
        boolean oldBouncer = age >= 18 || height >= 1.71 || isAbleToSingWell;
        return oldBouncer;
    }
}
