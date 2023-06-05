package com.sda.she_likes_java.lambda;

import javax.crypto.spec.PSource;

// API - Application programming interface
// contract - what to do
public class LambdaExercises {
    public static void main(String[] args) {
        Jogging slowMan = new SlowRunner();
        Jogging fastRunner = new FastRunner();

        justRun(slowMan);
        justRun(fastRunner);

        // anonymous classes - till Java 7
        Jogging middleOne = new Jogging() {
            @Override
            public void run() {
                System.out.println("Running in the middle");
            }
        };

        Jogging firstLambda = () -> {
        }; // creating the object
        Jogging secondLambda = () -> {
            System.out.println("Run from Lambda");
        };
        secondLambda.run();
        middleOne.run();
        //---------------------------------lambda-------------------------to call 1 method
        justRun(() -> {
            System.out.println("in place");
        });
        //--------------------------------------------------------------------------------\
        Walker johhny = () -> {
            System.out.println("Just walking always");
        };
        Adder longVersion = (int first, int second) -> {
            return first + second;
        };
        //just names of parameters without types
        Adder shorterVersion = (first, second) -> {
            return first + second;
        };
        Adder compactVersion = (first, second) -> first + second;

        Adder compactVersionWithManyInstructions = (first, second) -> {
            System.out.println("Performing operations...");
            return first + second;
        };


    }

    public static void justRun(Jogging runner) {
        runner.run();

    }
}
