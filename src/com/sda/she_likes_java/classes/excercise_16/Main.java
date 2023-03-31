package com.sda.she_likes_java.classes.excercise_16;

public class Main {
    public static void main(String[] args) {
        Animal dog=new Animal("Rex", 4,"terrier");
        Owner John=new Owner("Roger", "Freeman",dog);


        System.out.println("The owner" + John );

    }
}
