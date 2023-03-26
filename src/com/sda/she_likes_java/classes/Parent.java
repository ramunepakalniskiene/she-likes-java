package com.sda.she_likes_java.classes;

public class Parent {
    //    Exercise 15.
    //Create a Parent class containing the following variables:
    //- first name
    //- surname
    //- address - (use the class Address)
    //- firstChild (use class Person)
    //- secondChild (use class Person)


    public static void main(String[] args) {
        String firstName;
        String surname;
        Address address=new Address();
        Person firstChild= new Person();
        Person secondChild= new Person();

        address.countryAddressClass="India";

        firstChild.name="Rafael ";
        firstChild.surname="Smith ";
        firstChild.age=14;

        firstChild.addressPersonClass.countryAddressClass="United States of America";

//        firstChild.addressPersonClass.cityAddressClass="New York";
//        firstChild.addressPersonClass.streetAddressClass="5th avenue";

        System.out.println(String.valueOf(firstChild.age));

        System.out.println("First child is "+ firstChild.name.concat(firstChild.surname)+firstChild.age+" years old and currently lives in " + address);

        secondChild.name="Naomi ";
        secondChild.surname="Smith";
        secondChild.age=16;


        System.out.println("Second child is" + secondChild.name.concat(secondChild.surname) + secondChild.age+ " years old");


//       firstChild.toString(firstName,surname,address);




    }
}
