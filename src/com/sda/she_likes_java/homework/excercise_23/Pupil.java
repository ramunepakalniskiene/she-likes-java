package com.sda.she_likes_java.homework.excercise_23;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Pupil {
    private String name;
    private String surname;

    public Pupil(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


