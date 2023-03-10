package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your height?");
        double height = scanner.nextDouble();
        boolean isAllowedToParty= age>=16 && height>=171;

//        if (age >= 16 && height >= 171)
          if(isAllowedToParty) {
            System.out.println("You are very welcome to the best disco in the world!");
        } else {
            System.out.println("Please join us next year!");
        }
    }
}
