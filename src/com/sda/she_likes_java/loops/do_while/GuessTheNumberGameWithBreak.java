package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreak {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;
        System.out.println("random number provided by java is: " + someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me:)");

//        System.out.println("Guess a number between 1 and 20");

        do {
            System.out.println("Guess a number between 1 and 20");
            userAnswer = inputReader.nextInt();
            numberOfTrials--;
            if (numberOfTrials <= 0) {
                System.out.println("Sorry, no more trials!");
                break;
            }

        } while (userAnswer != someRandomNumber);

        if (userAnswer == someRandomNumber) {
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, try next time!");
        }
    }
}
