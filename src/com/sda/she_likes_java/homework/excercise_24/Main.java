package com.sda.she_likes_java.homework.excercise_24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishLithuanianDictionary dictionary = new EnglishLithuanianDictionary();
        System.out.println("Please, enter english word");
        Scanner scanner = new Scanner(System.in);
        dictionary.translate(scanner.next());

    }
}
