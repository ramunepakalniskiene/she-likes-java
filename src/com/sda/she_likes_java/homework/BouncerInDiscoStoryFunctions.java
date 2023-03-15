package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryFunctions {
    public static void main(String[] args) {


        Scanner inputReader = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = inputReader.nextInt();

        System.out.println("What is your height?");
        int height = inputReader.nextInt();

        System.out.println("Are you able to sing well?");
        boolean ableToSingWell = inputReader.nextBoolean();

       boolean youngBouncer = checkedByYoungBouncer(age, height, ableToSingWell);

        if (youngBouncer) {
            System.out.println("Well come to the best disco in the world!");
        } else {
            System.out.println("Sorry, come back next year");
            System.out.println();
            System.out.println("Wait I'll try old bouncer");
            System.out.println();
            boolean oldBouncer = checkedByOldBouncer(age, height, ableToSingWell);
            if (oldBouncer) {
                System.out.println("OldBouncer: WELCOME TO THE DISCO!!");
            } else {
                System.out.println("SORRY, NO CHANCE!");
            }
        }
    }
    // first line is function prototype
    public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell){
       return  age >= 18 && height >= 1.71 && isAbleToSingWell;
    }
    public static boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell){
        return age >= 18 || height >= 1.71 || isAbleToSingWell;
    }
}
