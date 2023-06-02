package com.sda.she_likes_java.exceptions;

public class RunTimeExample {
    public static void main(String[] args) {
        try {
//            String name = null;
//            name.length();
            throwRunTimeException();

        } catch (MyRunTimeException e) {
            System.out.println("here");

        }
        // using checked exceptions - we are forced to do something - RunTimeExceptions - are unhandled
        int[] numbers = new int[4];
        numbers[99] = 1;

    }

    public static void throwRunTimeException() throws MyRunTimeException {
        throw new MyRunTimeException("Do I need to handle it?");
    }
}
