package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    public String postalCode;

    //constructor
    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
//    // default constructor - without any parameters
    public FullAddress() {
    }
    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // let's create full address
        FullAddress myAddress = new FullAddress();

        myAddress.city="Tokyo";
        myAddress.country= "Japan";
        myAddress.street = "GODZILLA ROAD 999";
        myAddress.postalCode="90-555";

        System.out.println("Full address created by hand: " + myAddress);

        FullAddress createdWithFullConstructor = new FullAddress("Japan", "Tokyo", "Gozilla road", "90-555");

        System.out.println("Full address created with constructor: "  + createdWithFullConstructor);
    }
}
