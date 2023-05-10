package com.sda.she_likes_java.homework.excercise_23;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Subject {
    private String subject;
    private int[] grades;

    public Subject(String subject, int[] grades) {
        this.subject = subject;
        this.grades = grades;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}