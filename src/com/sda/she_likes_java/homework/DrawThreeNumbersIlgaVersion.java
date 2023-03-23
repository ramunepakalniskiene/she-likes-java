package com.sda.she_likes_java.homework;

import java.util.Random;

public class DrawThreeNumbersIlgaVersion {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int randomNumber1 = numberGenerator.nextInt(10);
        int randomNumber2 = numberGenerator.nextInt(10);
        int randomNumber3 = numberGenerator.nextInt(10);
        System.out.println("Random generator numbers are:");
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        int smallest, middle, largest;
        if (randomNumber1 <= randomNumber2 && randomNumber1 <= randomNumber3) {
            smallest = randomNumber1;
            if (randomNumber2 <= randomNumber3) {
                middle = randomNumber2;
                largest = randomNumber3;
            } else {
                middle = randomNumber3;
                largest = randomNumber2;
            }
        } else if (randomNumber2 <= randomNumber1 && randomNumber2 <= randomNumber3) {
            smallest = randomNumber2;
            if (randomNumber1 <= randomNumber3) {
                middle = randomNumber1;
                largest = randomNumber3;
            } else {
                middle = randomNumber3;
                largest = randomNumber1;
            }
        } else {
            smallest = randomNumber3;
            if (randomNumber1 <= randomNumber2) {
                middle = randomNumber1;
                largest = randomNumber2;
            } else {
                middle = randomNumber2;
                largest = randomNumber1;
            }
        }
        System.out.println("Sorted numbers:");
        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);
    }
}
