package com.sda.she_likes_java.homework.excercise_17;

import java.time.Year;
import java.util.Random;

public class BookLendingApplication {
    public static void main(String[] args) {
        System.out.println("Total amount of books now is: " + Book.getNumberOfCreatedBooks());
        System.out.println("=======================================");
        System.out.println("Manually created books are: ");

        Book firstBook = new Book("Stendhal", "Red&Black", Year.of(1830));
        Book secondBook = new Book("Balzac", "Father_Gorijot", Year.of(1835));
        Book thirdBook = new Book("Mark_Twain", "Tom_Sojer", Year.of(1876));

        Book[] listOfBooks = {firstBook, secondBook, thirdBook};
        for (Book x : listOfBooks) {
            System.out.println(x);
        }
        System.out.println("Manually created number of books are: "+ Book.getNumberOfCreatedBooks());
        System.out.println("======================================");

        Random random = new Random();
        int generatedNumberOfBooks = random.nextInt(10);
        System.out.println("Randomly created number of books are: " + generatedNumberOfBooks);
        for (int i = 0; i < generatedNumberOfBooks; i++) {
            System.out.println("It is randomly created book: ");

        }
        System.out.println("=====================================");
        Book.setNumberOfCreatedBooks(Book.getNumberOfCreatedBooks()+generatedNumberOfBooks);
        System.out.println("Totally created books are : "+ Book.getNumberOfCreatedBooks());

    }
}


