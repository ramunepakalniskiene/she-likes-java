package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    private String name;
    private String surname;
    private int age;
    private FullAddress address;

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public FullAddress getAddress() {
        return address;
    }

    public void setAddress(FullAddress address) {
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
