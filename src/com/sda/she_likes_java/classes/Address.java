package com.sda.she_likes_java.classes;

public class Address {
    @Override
    public String toString() {
        return "Address{" +
                "countryAddressClass='" + country + '\'' +
                ", cityAddressClass='" + city + '\'' +
                ", streetAddressClass='" + street + '\'' +
                ", postalCodeAddressClass=" + postalCode +
                '}';
    }

    String country; //="India";
    String city; //="Mumbai";
    String street; //="Pedder Road";
    public String postalCode; //=23568;
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


