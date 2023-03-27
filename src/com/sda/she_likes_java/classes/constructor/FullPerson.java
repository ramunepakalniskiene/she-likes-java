package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    String name;
    String surname;
    int age;
    FullAddress address;

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public FullPerson() {
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';


    }
    public void describeYourself(){
        System.out.println("I'm " + name);
    }
    public static void genericDescription(){
        System.out.println("Hi I'm ");
    }
    public static void main(String[] args) {
       FullAddress address = new FullAddress("Lithuania", "Vilnius", "Sanatariskiu", "90865");
       FullPerson person=new FullPerson("Rasa", "Rasutyte", 45,address);

        System.out.println("Person is: "+ person);
        person.describeYourself();
        FullPerson personWithoutAddress = new FullPerson("Tomas", "Tomasauskas", 50, null);
        personWithoutAddress.describeYourself();
        System.out.println("Person without address: " + personWithoutAddress);
        genericDescription();
    }
}
