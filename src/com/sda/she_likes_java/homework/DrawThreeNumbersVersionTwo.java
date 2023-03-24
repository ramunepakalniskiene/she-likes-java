package com.sda.she_likes_java.homework;

import java.util.Random;

public class DrawThreeNumbersVersionTwo {
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

//        ------------------------------------------------
//        1st IF option
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            maxNumber = firstNumber;
            if (secondNumber > thirdNumber) {
                middleNumber = secondNumber;
                minNumber = thirdNumber;
                System.out.println("1st IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else if(secondNumber<thirdNumber){
                middleNumber = thirdNumber;
                minNumber = secondNumber;
                System.out.println("1st IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            }
        }
//        ----------------------------------------------------------------
//        2nd IF option
        if (secondNumber > thirdNumber && secondNumber > firstNumber) {
            maxNumber = secondNumber;
            if (thirdNumber > firstNumber) {
                middleNumber = thirdNumber;
                minNumber = firstNumber;
                System.out.println("2nd IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else if(thirdNumber<firstNumber){
                middleNumber = firstNumber;
                minNumber = thirdNumber;
                System.out.println("2nd IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            }
        }
//        ----------------------------------------------------------------
//        3rd IF option
        if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            maxNumber = thirdNumber;
            if (firstNumber > secondNumber) {
                middleNumber = firstNumber;
                minNumber = secondNumber;
                System.out.println("3rd IF option 1st part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            } else if (firstNumber < secondNumber) {
                middleNumber = secondNumber;
                minNumber = firstNumber;
                System.out.println("3rd IF option 2nd part: \n minNumber is:  " + minNumber + "\n middleNumber is: " + middleNumber + "\n maxNumber is: " + maxNumber);
            }
        }
//        ----------------------------------------------------------------
//        EQUAL NUMBERS OPTIONS:
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            maxNumber = firstNumber;
            System.out.println("EQUALS 1st OPTION: All 3 numbers are equals: \n firstNumber is:  " + firstNumber + "\n secondNumber is: " + secondNumber + "\n thirdNumber is: " + thirdNumber);
        }
        if (firstNumber == secondNumber && firstNumber < thirdNumber) {
            maxNumber = thirdNumber;
            middleNumber = firstNumber;
            System.out.println("EQUALS 2nd OPTION: \n firstNumber and secondNumber are equals: " + middleNumber + "\n thirdNumber is: " + maxNumber);
        }
        if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            maxNumber = firstNumber;
            minNumber = thirdNumber;
            System.out.println("EQUALS 3rd OPTION: \n minNumber is thirdNumber : " + minNumber + "\n firstNumber and secondNumber are equals: " + maxNumber);
        }
        if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            maxNumber = secondNumber;
            minNumber = firstNumber;
            System.out.println("EQUALS 4th OPTION: \n minNumber is firstNumber : " + minNumber + "\n secondNumber and thirdNumber and are equals: " + maxNumber);
        }
        if (secondNumber == thirdNumber && secondNumber < firstNumber) {
            maxNumber = firstNumber;
            minNumber = secondNumber;
            System.out.println("EQUALS 5th OPTION: \n secondNumber and thirdNumber are equals : " + minNumber + "\n maxNumber is firstNumber " + maxNumber);
        }
        if (thirdNumber == firstNumber && thirdNumber > secondNumber) {
            maxNumber = thirdNumber;
            minNumber = secondNumber;
            System.out.println("EQUALS 6th OPTION: \n minNumber is secondNumber : " + minNumber + "\n firstNumber and thirdNumber and are equals: " + maxNumber);
        }
        if (thirdNumber == firstNumber && thirdNumber < secondNumber) {
            maxNumber = secondNumber;
            minNumber = thirdNumber;
            System.out.println("EQUALS 7th OPTION: \n firstNumber and thirdNumber are equals : " + minNumber + "\n secondNumber is maxNumber: " + maxNumber);
        }
    }
}









