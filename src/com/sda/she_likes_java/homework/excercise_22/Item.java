package com.sda.she_likes_java.homework.excercise_22;

import java.util.Objects;

public class Item {
    private String productName;
    private double productPrice;

    public Item(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.productPrice, productPrice) == 0 && Objects.equals(productName, item.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }

    static Item createItem(String productName, double productPrice) {
        return new Item(productName, productPrice);
    }


}


