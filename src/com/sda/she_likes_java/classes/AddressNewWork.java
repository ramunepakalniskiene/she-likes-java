package com.sda.she_likes_java.classes;

public class AddressNewWork {
    public static void main(String[] args) {

        Address newWork = new Address();

        newWork.countryAddressClass = "United States of America";
        newWork.cityAddressClass="New York ";
        newWork.streetAddressClass= "house no.500, 5th avenue, ";
        newWork.postalCodeAddressClass=10128;

        System.out.println("Hello, my new work will be in " + newWork.cityAddressClass + "!!!!");
        System.out.println("Please note, the address is: " + newWork.cityAddressClass +newWork.streetAddressClass+newWork.postalCodeAddressClass);
        System.out.printf("Please note, the address %s, %s, %s",newWork.cityAddressClass, newWork.streetAddressClass, newWork.postalCodeAddressClass);
    }

}
