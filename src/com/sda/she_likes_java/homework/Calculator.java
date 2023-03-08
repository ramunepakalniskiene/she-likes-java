package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("com.sda.she_likes_java.homework.Calculator...");

        System.out.println("Calculating sum of two numbers");
        System.out.println("Provide 1st number: ");
        int firstNumber;
        int secondNumber;

        //        TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided 1st number: " + firstNumber);
        System.out.println("Provide 2nd number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided 2dn number: " + secondNumber);

        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        int difference = secondNumber - firstNumber;
        System.out.println("Difference is:" + difference);

        int product = secondNumber * firstNumber;
        System.out.println("Product equals: " + product);

        int quotient = secondNumber / firstNumber;
        System.out.println("Quotient is: " + quotient);

    }
}