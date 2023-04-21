package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat cat = new Cat();

        Animal secondCat = new Cat();

        someAnimal.makeSound();
        cat.makeSound();

        Animal dog = new Dog();
        dog.makeSound();

        System.out.println("=====================");
        callAnimal(someAnimal);
        callAnimal(cat);
        callAnimal(dog);
        callAnimal(new Elephant());

        Object anotherCat = new Cat();
        // anotherCat.sleep();
        Animal animalCat = new Cat();
        // animalCat.sleep();
        Cat thirdCat = new Cat();
        thirdCat.sleep();


    }

    public static void callAnimal(Animal animal) {
        animal.makeSound();
    }
}
