package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Subject {
    private final String subjectName;

    public Subject(String subjectName) {

        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return Objects.equals(subjectName, subject.subjectName);
    }

    @Override
    public int hashCode() {
        return subjectName != null ? subjectName.hashCode() : 0;
    }

    public String getSubjectName() {
        return subjectName;
    }
}

