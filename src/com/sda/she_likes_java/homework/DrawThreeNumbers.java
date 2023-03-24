package com.sda.she_likes_java.homework;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class DrawThreeNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int firstNumber = random.nextInt(10);
        int secondNumber = random.nextInt(10);
        int thirdNumber = random.nextInt(10);

        int minNumber;
        int middleNumber;
        int maxNumber;

        System.out.println("Three random numbers are: ");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            maxNumber = firstNumber;
            if (secondNumber >= thirdNumber) {
                middleNumber = secondNumber;
                minNumber = thirdNumber;
                System.out.println("1st IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else {
                middleNumber = thirdNumber;
                minNumber = secondNumber;
                System.out.println("1st IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            }
        }
        if (secondNumber >= thirdNumber && secondNumber >= firstNumber) {
            maxNumber = secondNumber;
            if (thirdNumber >= firstNumber) {
                middleNumber = thirdNumber;
                minNumber = firstNumber;
                System.out.println("2nd IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else {
                middleNumber = firstNumber;
                minNumber = thirdNumber;

            } System.out.println("2nd IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
        }
        if (thirdNumber >= secondNumber && thirdNumber >= firstNumber) {
            maxNumber = thirdNumber;
            if (firstNumber >= secondNumber) {
                middleNumber = firstNumber;
                minNumber = secondNumber;
                System.out.println("3rd IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else {
                middleNumber = secondNumber;
                minNumber = firstNumber;
                System.out.println("3rd IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            }

        }
    }
}






