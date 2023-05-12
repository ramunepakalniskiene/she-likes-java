package com.sda.she_likes_java.collections.lists.examples;

import java.util.List;

public class MyDictionaries {
    // create english lithuanian dictionary
    public static MyGreatDictionary createEnglishLithuanianDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("dog", "suo"),
                new WordsBilingual("cat", "kate"),
                new WordsBilingual("bird", "paukstis"),
                new WordsBilingual("animal", "gyvunas"),
                new WordsBilingual("human", "zmogus")
        );
        MyGreatDictionary englishLithuanianDictionary = new MyGreatDictionary();
        englishLithuanianDictionary.fillWithWordsBilingual(list);
        return englishLithuanianDictionary;
    }

    // create english russian dictionary
    public static MyGreatDictionary createEnglishRussianDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("dog", "sobaka")

        );
        MyGreatDictionary englishRussianDictionary = new MyGreatDictionary();
        englishRussianDictionary.fillWithWordsBilingual(list);
        return englishRussianDictionary;
    }
}
