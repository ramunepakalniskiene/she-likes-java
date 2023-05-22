package com.sda.she_likes_java.exceptions;

import java.sql.Time;
import java.time.LocalDate;

public class SecretExampleMain {
    public static void main(String[] args) {
        SecretLocker secretStorage = new SecretLocker(new Secret(LocalDate.of(2022, 2, 15), "My baby was born"));
        System.out.println("I know your secret now!!!");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy biggest secret was...:" + enemySecret);
        try {
            System.out.println("Inside try block");
            Secret enemysSecret = secretStorage.decryptMessageWithHSM();
            System.out.println("Enemy's secret: " + enemysSecret);
        } catch (Exception e) {
            System.out.println("Catch - Unexpected exception: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("After problematic source code");
        System.out.println("==============");
        System.out.println("Let's play again with our own exceptions");
        try {
            Secret stupidSecret = secretStorage.decrypt();
        } catch (HSMConnectionException e) {
            System.out.println("Connection issue " + e.getMessage());
        } catch (DecryptionIssueException e) {
            System.out.println("Cannot decrypt enemy's secret " + e.getMessage());
        }


    }
}
