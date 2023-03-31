package com.sda.she_likes_java.homework.excercise_15;

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

    String countryAddressClass; //="India";
    String cityAddressClass; //="Mumbai";
    String streetAddressClass; //="Pedder Road";
    int postalCodeAddressClass; //=23568;

}


