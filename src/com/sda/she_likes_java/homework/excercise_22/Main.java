package com.sda.she_likes_java.homework.excercise_22;

import java.util.ArrayList;
import java.util.List;

import static com.sda.she_likes_java.homework.excercise_22.Item.createItem;

public class Main {
    public static void main(String[] args) {

        List<Item> allItems = new ArrayList<>();
        Item foodDrinks = new Item("milk", 2.80);
        Item foodMeal = new Item("Chicken", 4.75);
        Item houseHold = new Item("Cleaner", 3.50);

        allItems.add(foodDrinks);
        allItems.add(foodMeal);
        allItems.add(houseHold);

        List<Item> all2Items = new ArrayList<>();
        Item foodDrinks1 = new Item("caco", 2.22);
        Item foodMeal1 = new Item("Pork", 5.55);
        Item houseHold1 = new Item("Brush", 7.77);

        all2Items.add(foodDrinks1);
        all2Items.add(foodMeal1);
        all2Items.add(houseHold1);

        System.out.println(allItems);

        System.out.println(createItem("coca-cola", 1.99));

        ShoppingCart shoppingCart1 = new ShoppingCart("whiskey", 19.99, all2Items);
        List<ShoppingCart> allShoppingCarts = new ArrayList<>();
        shoppingCart1.shoppingCartValue();
    }
}