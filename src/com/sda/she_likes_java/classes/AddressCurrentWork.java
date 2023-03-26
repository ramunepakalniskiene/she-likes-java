package com.sda.she_likes_java.classes;

public class AddressCurrentWork {
    public static void main(String[] args) {

        Address currentWork = new Address();

        currentWork.countryAddressClass="LITHUANIA";
        currentWork.cityAddressClass="Klaipeda";
        currentWork.streetAddressClass="Naujoji uosto";
        currentWork.postalCodeAddressClass=96177;

        System.out.println("I am now in " + currentWork.countryAddressClass);
        System.out.printf("I am currently working in %s in %s%n",currentWork.countryAddressClass,currentWork.cityAddressClass);
        System.out.printf("The street name is %s postal code %s", currentWork.streetAddressClass, currentWork.postalCodeAddressClass);
    }
}
