package com.sda.she_likes_java.homework.excercise_17;

public class Book {
    String Author;
    String title;
    int yearOfProduction;

    public Book(String author, String title, int yearOfProduction) {
        this.Author = author;
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

