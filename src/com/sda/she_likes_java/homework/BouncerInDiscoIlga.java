package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoIlga {
    public static void main(String[] args) {
        System.out.println("Ready to PARTY?");

        System.out.println("Check out your ability to get in by typing in your age");
        Scanner inputReader = new Scanner(System.in);
        String declineTxt = "my eyesight is not so good anymore, but I think You ar good to go, have a great party ";
        int age = inputReader.nextInt();

        System.out.println("Let me know Your height now: ");
        double height = inputReader.nextDouble();

        System.out.println("Can you sing?");
        String canSing = inputReader.next().toLowerCase();

        boolean answer;
        if (canSing.equals("yes")) {
            answer = true;
        } else if (canSing.equals("no")) {
            answer = false;
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return;
        }

        boolean goHome = age <= 18 && height <= 165 && answer == false;
        boolean partyYoung = age >= 18 && height >= 165 && answer == true;

        if (goHome) {
            System.out.println("Go Home!!! No second chances tonight!");
        } else if (partyYoung) {
            System.out.println("You can party all night!");
        } else {
            System.out.println(declineTxt);
        }
    }
}

