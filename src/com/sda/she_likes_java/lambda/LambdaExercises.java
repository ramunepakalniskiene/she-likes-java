package com.sda.she_likes_java.lambda;

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
        //--------------------------------------------------------------------------------

    }

    public static void justRun(Jogging runner) {
        runner.run();

    }
}
