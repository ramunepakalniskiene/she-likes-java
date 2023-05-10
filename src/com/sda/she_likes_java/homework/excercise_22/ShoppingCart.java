package com.sda.she_likes_java.homework.excercise_22;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> basket;

    public ShoppingCart() {
        this.basket = new ArrayList<>();
    }

    public void displayBasket() {
        System.out.println("The basket contains" + basket);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "basket=" + basket +
                '}';
    }

    public void addToShoppingCart(Item products) {
        basket.add(products);

    }

    public double shoppingCartValue() {
        double value = 0;
        for (Item items : basket) {
            value += items.getProductPrice();
        }
        return value;
    }
}

