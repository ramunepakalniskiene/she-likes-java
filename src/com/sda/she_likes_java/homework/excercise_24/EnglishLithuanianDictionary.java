package com.sda.she_likes_java.homework.excercise_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnglishLithuanianDictionary {
    private final Map<String, String> dictionary;

    public EnglishLithuanianDictionary() {
        dictionary = new HashMap<String, String>();

        dictionary.put("dog", "suo");
        dictionary.put("cat", "kate");
        dictionary.put("bird", "paukstis");
        dictionary.put("animal", "gyvunas");
        dictionary.put("human", "zmogus");
        dictionary.put("man", "vyras");
        dictionary.put("boy", "berniukas");
        dictionary.put("girl", "mergaite");
        dictionary.put("house", "namas");
        dictionary.put("car", " masina");

    }

    public void translate(String englishWord) {
        String englishTranslation = dictionary.get(englishWord);
        if (englishTranslation != null) {
            System.out.printf("English word: [%s] means [%s] in lithuanian%n", englishWord, englishTranslation);
        } else {
            System.out.printf("Don't know how to translate [%s] into lithuanian%n", englishWord);

        }
    }
}