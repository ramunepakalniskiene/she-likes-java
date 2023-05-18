package com.sda.she_likes_java.exceptions;

public class BankExampleMain {
    public static void main(String[] args) {
        BankConnector connector = new BankConnector();
        System.out.println("Let's try to check balance");
        int myMoney = 0;
        try {
            myMoney = connector.accountBalance();
            System.out.println("My money: " + myMoney + " euros");
        } catch (Exception e) {
            System.out.println("Unexpected condition occurred");
            System.out.println("Exception e: " + e);
        }
    }
}
