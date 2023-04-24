package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {

            human.whoYouAre();

        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {
        // instanceof operator - tests if argument is of given type
        // tests if maybeWomanOrMan is of type Man
        if (maybeWomanOrMan instanceof Man) {
            ((Man) maybeWomanOrMan).learnToCleanHouse();

        }
        //casting from one type to another / casting down in hierarchy
        // casting works for references, we need casting to access methods which are in classes below
        if (maybeWomanOrMan instanceof Woman) {
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }

}
