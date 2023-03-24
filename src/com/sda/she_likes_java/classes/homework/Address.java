package com.sda.she_likes_java.classes.homework;

public class Address {

    String country;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    String city;
    String street;
    int postalCode;
    public static void main(String[] args) {
        Address myFirstAddress = new Address();
        myFirstAddress.country = "Poland";
        myFirstAddress.city = "Warsaw";

        Address mySecondAddress = new Address();
        mySecondAddress.country = "Poland";
        mySecondAddress.city = "Rzeszow";

        System.out.println("City from first address: " + myFirstAddress.city);
        System.out.println("City from second address: " + mySecondAddress.city);

        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);
    }
}


