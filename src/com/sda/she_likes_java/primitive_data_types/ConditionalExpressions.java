package com.sda.she_likes_java.primitive_data_types;

import java.util.Scanner;

public class ConditionalExpressions {
    public static void main(String[] args) {
        System.out.println("Conditionals :");

        int age=15;
        boolean isKid=age<18;
        System.out.println("Is kid younger than 18: " + isKid);

        boolean condition = false;
        if(condition){
            System.out.println("This will be run only when condition is true");
        }else{
            System.out.println("This will be run when condition is false");
        }
        System.out.println();

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are you? ");
        int personAge = inputReader.nextInt();

        if(personAge>=18) {
            System.out.println("Hello lady!");
        } else{
            System.out.println("It's time to go to sleep, Kid");
        }
    }
}
