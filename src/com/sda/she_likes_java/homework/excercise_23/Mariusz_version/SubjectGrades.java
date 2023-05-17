package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubjectGrades {
    private final Subject subject;
    private final List<Grade> grades;

    public SubjectGrades(Subject subject) {
        this.subject = subject;
        grades = new ArrayList<>();
        grades.add(0, new Grade(5));
        grades.add(0, new Grade(6));
        grades.add(0, new Grade(7));
        grades.add(0, new Grade(9));
        grades.add(1, (new Grade(10)));
        grades.add(1, (new Grade(9)));
        grades.add(1, (new Grade(8)));
        grades.add(1, (new Grade(7)));
        grades.add(2, new Grade(9));
        grades.add(2, new Grade(9));
        grades.add(2, new Grade(9));
        grades.add(2, new Grade(9));
        grades.add(3, new Grade(10));
        grades.add(3, new Grade(10));
        grades.add(3, new Grade(10));
        grades.add(3, new Grade(10));


    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public Subject getSubject() {
        return subject;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "SubjectGrade{" +
                "subject=" + subject +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectGrades that = (SubjectGrades) o;

        if (!Objects.equals(subject, that.subject)) return false;
        return Objects.equals(grades, that.grades);
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + (grades != null ? grades.hashCode() : 0);
        return result;
    }
}

