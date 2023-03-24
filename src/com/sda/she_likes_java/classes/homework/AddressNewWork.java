package com.sda.she_likes_java.classes.homework;

public class AddressNewWork {
    public static void main(String[] args) {

        Address newWork = new Address();

        newWork.country = "United States of America";
        newWork.city="New York ";
        newWork.street= "house no.500, 5th avenue, ";
        newWork.postalCode=10128;

        System.out.println("Hello, my new work will be in " + newWork.country + "!!!!");
        System.out.println("Please note, the address is: " + newWork.city +newWork.street+newWork.postalCode);
        System.out.printf("Please note, the address %s, %s, %s",newWork.city, newWork.street, newWork.postalCode);
    }
}
