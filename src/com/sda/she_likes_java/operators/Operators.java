package com.sda.she_likes_java.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Let's try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
        boolean secondValue;
        boolean evaluationResult;

        System.out.println("&& operator");
        firstValue = true;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && true: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);

        System.out.println();
        System.out.println("Let's test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is: " + secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is: " + secondValue);

        boolean polite = false;
        if (!polite) {
            System.out.println("You're not polite, or just naughty");
        }

        boolean naughty = true;
        if (naughty) {
            System.out.println("You're not polite, or just naughty");

        }
        System.out.println();
        System.out.println("Let's see now ||  - or operator");

        boolean hasGun= true;
        boolean hasGrenade=true;
        boolean isTerrorist=hasGun||hasGrenade;
        System.out.println("true|| true is: " + isTerrorist);

        hasGun=true;
        hasGrenade=false;

        isTerrorist=hasGun||hasGrenade;
        System.out.println("true || false is: " + isTerrorist);

        hasGun=false;
        hasGrenade=true;
        isTerrorist=hasGun||hasGrenade;
        System.out.println("false || true is: " + isTerrorist);

        hasGun=false;
        hasGrenade=false;
        isTerrorist=hasGun||hasGrenade;
        System.out.println("false || false is: " + isTerrorist);
    }
}