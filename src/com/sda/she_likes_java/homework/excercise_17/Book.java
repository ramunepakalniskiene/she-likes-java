package com.sda.she_likes_java.homework.excercise_17;

import java.time.Year;

public class Book {
    static int numberOfCreatedBooks;
    String author;
    String title;
    Year publicationYear;

    public Book(String author, String title, Year publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        numberOfCreatedBooks++;
    }

    public static int getNumberOfCreatedBooks() {

        return numberOfCreatedBooks;
    }

    public static void setNumberOfCreatedBooks(int numberOfCreatedBooks) {
        Book.numberOfCreatedBooks = numberOfCreatedBooks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Year publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}




