package com.sda.she_likes_java.classes;

public class Address {
    @Override
    public String toString() {
        return "Address{" +
                "countryAddressClass='" + countryAddressClass + '\'' +
                ", cityAddressClass='" + cityAddressClass + '\'' +
                ", streetAddressClass='" + streetAddressClass + '\'' +
                ", postalCodeAddressClass=" + postalCodeAddressClass +
                '}';
    }

    String countryAddressClass="India";
    String cityAddressClass="Mumbai";
    String streetAddressClass="Pedder Road";
    int postalCodeAddressClass=23568;
    public static void main(String[] args) {
        Address myFirstAddress = new Address();
        myFirstAddress.countryAddressClass = "Poland";
        myFirstAddress.cityAddressClass = "Warsaw";

        Address mySecondAddress = new Address();
        mySecondAddress.countryAddressClass = "Poland";
        mySecondAddress.cityAddressClass = "Rzeszow";

        System.out.println("City from first address: " + myFirstAddress.cityAddressClass);
        System.out.println("City from second address: " + mySecondAddress.cityAddressClass);

        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);
    }
}


