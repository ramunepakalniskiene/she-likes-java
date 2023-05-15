package com.sda.she_likes_java.collections.lists.examples;

import java.io.Console;
import java.util.Scanner;

import static com.sda.she_likes_java.collections.lists.examples.MyDictionaries.createEnglishLithuanianDictionary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, which dictionary you'd like to use");
        System.out.println("type 1 for English - Lithuanian");
        System.out.println("type 2 for English - Russian");
//        Console console = System.console();
//        String userChoice = console.readLine();
        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();

        MyGreatDictionary currentDictionary;
        if (userChoice.equals("1")) {
            currentDictionary = MyDictionaries.createEnglishLithuanianDictionary();
            System.out.println("let's use English - Lithuanian dictionary");
        } else if (userChoice.equals("2")) {
            currentDictionary = MyDictionaries.createEnglishRussianDictionary();
            System.out.println("let's use English - Russian dictionary");
        } else {
            System.out.println("I don't know what you mean");
            return;
        }

        System.out.println("Provide word to translate: ");
        String wordFromTheUser = inputReader.next();
        currentDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
    }
}
