package com.sda.she_likes_java.homework.excercise_16;

public class Main {
    public static void main(String[] args) {
        Animal dog=new Animal("Rex", 4,"terrier");
        Owner John=new Owner("Roger", "Freeman",dog);


        System.out.println("The owner and this pet: " + John );
        System.out.println(dog.getAge());
        dog.setAge(5);
        System.out.println(dog);

    }
}
