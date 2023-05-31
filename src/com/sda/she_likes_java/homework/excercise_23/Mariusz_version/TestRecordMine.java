package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

public class TestRecordMine {
    private Integer id; // ID column from DB
    private String name; // name column from DB
    private String surname;
    private String currentClass;


    public TestRecordMine(Integer id, String name, String surname, String currentClass) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.currentClass = currentClass;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public String toString() {
        return "TestRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentClass='" + currentClass + '\'' +
                '}';
    }
}
