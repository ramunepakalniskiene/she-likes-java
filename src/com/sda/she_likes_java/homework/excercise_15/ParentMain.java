package com.sda.she_likes_java.homework.excercise_15;

public class ParentMain {
    //    Exercise 15.
    //Create a Parent class containing the following variables:
    //- first name
    //- surname
    //- address - (use the class Address)
    //- firstChild (use class Person)
    //- secondChild (use class Person)

    String firstName;
    String surname;

    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Address address=new Address();
        Person firstChild= new Person();
        Person secondChild= new Person();

//        Parent mother = new Parent();
//        Parent father = new Parent();

//        mother.firstName="Amanda ";
//        mother.surname="Johnson-Smith ";

//        father.firstName="Peter ";
//        father.surname="Smith ";

//        System.out.println(mother);
//        System.out.println(father);

        firstChild.name="Rafael ";
        firstChild.surname="Smith ";
        firstChild.age=14;

//        firstChild.addressPersonClass.countryAddressClass="United States of America, ";
//        firstChild.addressPersonClass.cityAddressClass="New York, ";
//        firstChild.addressPersonClass.streetAddressClass="5th avenue ";
//        firstChild.addressPersonClass.postalCodeAddressClass=10205;
//        System.out.println("First child is "+
//                            firstChild.name+
//                            firstChild.surname+
//                            firstChild.age+ " years old and currently lives in " +
//                            firstChild.addressPersonClass.countryAddressClass +
//                            firstChild.addressPersonClass.cityAddressClass +
//                            firstChild.addressPersonClass.streetAddressClass+
//                            firstChild.addressPersonClass.postalCodeAddressClass);

        secondChild.name="Naomi ";
        secondChild.surname="Smith ";
        secondChild.age=12;

//        secondChild.addressPersonClass.countryAddressClass="JAPAN, ";
//        secondChild.addressPersonClass.cityAddressClass="TOKYO, ";
//        secondChild.addressPersonClass.streetAddressClass="GODZILLA ROAD 999, ";
//        secondChild.addressPersonClass.postalCodeAddressClass=30058;
//
//
//        System.out.println("Second child is " +
//                secondChild.name +
//                secondChild.surname +
//                secondChild.age+ " years old and currently lives in " +
//                secondChild.addressPersonClass.countryAddressClass +
//                secondChild.addressPersonClass.cityAddressClass +
//                secondChild.addressPersonClass.streetAddressClass +
//                secondChild.addressPersonClass.postalCodeAddressClass);
//

//       firstChild.toString(firstName,surname,address);

        System.out.println("The city of childhood was: " + address.cityAddressClass);


    }

}
