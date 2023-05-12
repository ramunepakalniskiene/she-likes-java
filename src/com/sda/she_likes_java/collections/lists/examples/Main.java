package com.sda.she_likes_java.collections.lists.examples;

import static com.sda.she_likes_java.collections.lists.examples.MyDictionaries.createEnglishLithuanianDictionary;

public class Main {
    public static void main(String[] args) {
        MyGreatDictionary englishLithuanianDictionary = MyDictionaries.createEnglishLithuanianDictionary();
        englishLithuanianDictionary.translateFromSourceLanguageToDestiny("dog");
        englishLithuanianDictionary.translateFromSourceLanguageToDestiny("man");
    }
}
