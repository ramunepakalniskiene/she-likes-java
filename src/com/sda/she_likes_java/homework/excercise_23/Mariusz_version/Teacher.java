package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.util.Objects;

public class Teacher {
    private String name;
    private String surename;
    private String classNumber;

    public Teacher(String name, String surename, String classNumber) {
        this.name = name;
        this.surename = surename;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public String getClassNumber() {
        return classNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return Objects.equals(getName(), teacher.getName()) && Objects.equals(getSurename(), teacher.getSurename()) && Objects.equals(getClassNumber(), teacher.getClassNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurename(), getClassNumber());
    }
}
//creating some teachers
//    Teacher englishTeacher = new Teacher("Flora", "Smith", "5B");
//    Teacher lithuaninanTeacher = new Teacher("Agne", "Paule", "6A");
//    Teacher chemistryTeacher = new Teacher("Julia", "Frog", "7A");
