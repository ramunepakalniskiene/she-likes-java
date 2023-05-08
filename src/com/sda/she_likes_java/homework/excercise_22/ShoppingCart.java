package com.sda.she_likes_java.homework.excercise_22;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart extends Item {
    List<Item> basket;

    public ShoppingCart(String productName, double productPrice, List<Item> basket) {
        super(productName, productPrice);
        this.basket = basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;

    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "basket=" + basket +
                '}';
    }

    public List<Item> addToShoppingCart(ShoppingCart shoppingCart) {

        return null;
    }

    public double shoppingCartValue() {
        double value = 0;
        for (Item item : basket)
            value = getProductPrice() + value;
        return value;
    }

}

