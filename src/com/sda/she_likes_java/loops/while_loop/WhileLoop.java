package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        // how to make our calculations in a loop
        // CTRL+D

        System.out.println("I am here");
        System.out.println("I am here");
        System.out.println("I am here");

        boolean condition = false;


        // while loop is going to be executed only when condition is true
        // the body of while loop is going to be repeated as many times as conditions
        while (condition) {
            System.out.println("Java forever");

//        }

        }
        int numberOfTrials = 5;
        while(numberOfTrials>0) {
            System.out.println("Minus 1 ¨: " + numberOfTrials);
            numberOfTrials = numberOfTrials - 1;
//            if (numberOfTrials % 2 == 1)
                System.out.println("Current value of number = " + numberOfTrials);

        }
        System.out.println("The end!");
    }
}
