package com.sda.she_likes_java.homework.excercise_22;

import java.util.ArrayList;
import java.util.List;

import static com.sda.she_likes_java.homework.excercise_22.Item.createItem;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item foodDrinks = new Item("milk", 2.80);
        Item foodMeal = new Item("Chicken", 4.75);
        Item houseHold = new Item("Cleaner", 3.50);


        Item foodDrinks1 = new Item("caco", 2.22);
        Item foodMeal1 = new Item("Pork", 5.55);
        Item houseHold1 = new Item("Brush", 7.77);

        shoppingCart.addToShoppingCart(foodDrinks);
        shoppingCart.addToShoppingCart(foodDrinks1);
        shoppingCart.addToShoppingCart(foodMeal);
        shoppingCart.addToShoppingCart(foodMeal1);
        shoppingCart.addToShoppingCart(houseHold);
        shoppingCart.addToShoppingCart(houseHold1);

        shoppingCart.displayBasket();
        System.out.println("=============");
        System.out.println("The total amount to be paid:  " + shoppingCart.shoppingCartValue());


    }
}