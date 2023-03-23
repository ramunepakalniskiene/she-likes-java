package com.sda.she_likes_java.classes.homework;

public class AddressCurrentWork {
    public static void main(String[] args) {

        Address currentWork = new Address();
        currentWork.country="LITHUANIA";
        currentWork.city="Klaipeda";
        currentWork.street="Naujoji uosto";
        currentWork.postalCode=96177;

        System.out.println("I am now in " + currentWork.country);
        System.out.printf("I am currently working in %s in %s%n",currentWork.country,currentWork.city);
        System.out.printf("The street name is %s postal code %s", currentWork.street, currentWork.postalCode);
    }
}
