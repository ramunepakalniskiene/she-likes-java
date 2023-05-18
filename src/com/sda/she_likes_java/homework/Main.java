package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int myDaugtherAge = 11;
        myDaugtherAge = 12;
        System.out.println(myDaugtherAge);

        String myName = "Ramune";
        String mySurName = "Pakalniskiene";
        System.out.println(myName + "  " + mySurName);

        String five = "5";
        String otherFive = "5";
        System.out.println(five + otherFive);

        // true false
        boolean trueValue = true;
        trueValue = false;
        System.out.println(trueValue);

        //11.0
        int eleven = 11;
        double trueEleven = 11;
        System.out.println(eleven + " + " + 11);
        System.out.println(getSum());
    }

    public static int getSum() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        return sum;
    }

}
