package com.sda.she_likes_java.mine_tasks.ship_batle;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SimpleStartupMain {
    public static void main(String[] args) {
        SimpleStartup simpleStartup = new SimpleStartup();
        int numberOfGuesses = 0;
        int[] locations = {2, 3, 4};

        System.out.println("Let's play a ship battle game!");
        System.out.println("Guess 3 numbers: from 0 to 4");
        simpleStartup.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            Scanner reader = new Scanner(System.in);
            String result = simpleStartup.checkYourself(reader.nextInt());
            numberOfGuesses++;
            if (result.equals("hit")) {
                isAlive = false;
                System.out.println("You took " + numberOfGuesses + "guesses");
            } else {
                System.out.println("Missed! Try again!");
            }

        }
    }
}

