package com.sda.she_likes_java.functions;

public class CalculatorWithFunctions {
    public static void main(String[] args) {
        System.out.println("Let's start calculations");
        sum(3,4);
        System.out.println(sum(1,2));
        System.out.println(12%13);
    }
    public static int sum(int firstNumber, int secondNumber){
//        System.out.println(" I'm not so smart calculator");
        int result = firstNumber+secondNumber;
//        System.out.println("Result of calculation is : " + result);
     return result;
    }
}
