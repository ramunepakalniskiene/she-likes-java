package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = 6;
        final int b = 7;

        List<Trousers> trousers = new ArrayList<>();
        trousers.add(new Trousers("jeans", "big star"));
        trousers.add(new Trousers("jeans", "primark"));
        showItemsFromTheList(trousers);
        System.out.println(trousers.get(1));

        List<Trousers> trousersList = List.of(
                new Trousers("jeans", "Levis"),
                new Trousers("jeans", "Big-star"),
                new Trousers("jeans", "Newyorker")
        );
        showItemsFromTheList(trousersList);
//       list of - useful if the list is final
    }

    public static void showItemsFromTheList(List<Trousers> items) {
        //enhanced for loop
//        for (int i = 0; i < items.size(); i++) {
        for (Trousers currentItem : items) {
            System.out.println(currentItem);

        }
    }
}
