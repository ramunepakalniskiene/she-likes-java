package com.sda.she_likes_java.homework.excercise_17;

import java.time.Year;
import java.util.Random;

public class Book_Mariusz_version {
    public static void main(String[] args) {
        System.out.println("Let’s create some books");
        createBourneTrilogy();
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());

        Book[] createdArray = createBourneTrilogyAndStoreItInArray();
        Book toCopy = new Book("Bourne Ultimatum", "Robert Ludlum", Year.of(1990));
        Book[] twoBooks = createCopyOfBook(toCopy);
        System.out.println("First copy " + twoBooks[0]);
        System.out.println("Second copy" + twoBooks[1]);
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());

    }

    public static void createBourneTrilogy() {
        Random random = new Random();
        int numberOfIterations = random.nextInt(10);
        for (int i = 0; i < numberOfIterations; i++) {
            new Book("Bourne Identity", "Robert Ludlum", Year.of(1980));
            new Book("Bourne Supremacy", "Robert Ludlum", Year.of(1986));
            new Book("Bourne Ultimatum", "Robert Ludlum", Year.of(1990));
        }
    }

    public static Book[] createCopyOfBook(Book bookToCopy) {
        Book[] booksShelf = new Book[2];
        booksShelf[0] = new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getPublicationYear());
        booksShelf[1] = new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getPublicationYear());
        return booksShelf;
    }

    public static Book[] createBourneTrilogyAndStoreItInArray() {
        Random random = new Random();
        int numberOfIterations = random.nextInt(10);
        Book[] books = new Book[numberOfIterations];
        for (int i = 0; i < numberOfIterations; i++) {
            books[i] = new Book("Bourne Identity", "Robert Ludlum", Year.of(1980));
        }

        return books;
    }
}

