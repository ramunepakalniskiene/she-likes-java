package com.sda.she_likes_java.collections.lists.examples;

import java.util.ArrayList;
import java.util.List;

public class MyGreatDictionary {
    private List<WordsBilingual> dictionary;

    public MyGreatDictionary() {
        dictionary = new ArrayList<>();
    }

    public void fillWithWordsBilingual(List<WordsBilingual> listOfWords) {
        dictionary.addAll(listOfWords);

    }

    public void translateFromSourceLanguageToDestiny(String sourceWord) {
//        iterate through the list
        for (WordsBilingual currentWordPair : dictionary) {
            //        compare sourceWord with sourceLanguage from current item
            if (currentWordPair.getSourceLanguage().equals(sourceWord)) {
                //        if we found a match - beak, and provide nice message to the user
                String translated = currentWordPair.getDestinyLanguage();
                System.out.printf("Translation of [%s] is [%s] %n", sourceWord, translated);
                return;
            }
        }
        //        otherwise say sorry
        System.out.printf("Sorry, no translation of [%s] %n", sourceWord);


    }
}
