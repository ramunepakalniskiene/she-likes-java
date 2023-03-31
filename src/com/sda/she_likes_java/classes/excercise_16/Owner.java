package com.sda.she_likes_java.classes.excercise_16;

public class Owner {
    private String firstName;
    private String surename;
    Animal myAnimal;

    public Owner(String firstName,String surename,Animal animal){
        this.firstName=firstName;
        this.surename=surename;
        this.myAnimal=myAnimal;
    }
    public Owner(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Animal getAnimal() {
        return myAnimal;
    }

    public void setAnimal(Animal animal) {
        this.myAnimal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surename='" + surename + '\'' +
                ", animal=" + myAnimal +
                '}';
    }
}
