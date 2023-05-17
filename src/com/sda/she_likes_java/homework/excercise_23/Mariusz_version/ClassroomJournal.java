package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;


import java.util.*;

public class ClassroomJournal {

    private final Set<Pupil> pupils;
    private final Set<Subject> subjects;
    private final Map<Pupil, Set<Subject>> pupilSubjects;
    private final Map<Pupil, List<SubjectGrades>> pupilsGradeFromSubject;

    public ClassroomJournal() {
        pupils = new HashSet<>();
        pupils.add(new Pupil("Aaron", "Jones", "7B"));
        pupils.add(new Pupil("Melisa", "Core", "6C"));
        pupils.add(new Pupil("Tom", "Rogers", "5A"));
        pupils.add(new Pupil("James", "Collin", "5B"));
        pupils.add(new Pupil("Ryan", "Bills", "7C"));
        pupils.add(new Pupil("Amanda", "Fridge", "6A"));

        subjects = new HashSet<>();
        subjects.add(new Subject("biology"));
        subjects.add(new Subject("maths"));
        subjects.add(new Subject("literature"));

        pupilSubjects = new HashMap<>();
        pupilSubjects.put(new Pupil("Aaron", "Jones", "7B"), subjects);
        pupilSubjects.put(new Pupil("Melisa", "Core", "6C"), subjects);
        pupilSubjects.put(new Pupil("Tom", "Rogers", "5A"), subjects);
        pupilSubjects.put(new Pupil("James", "Collin", "5B"), subjects);
        pupilSubjects.put(new Pupil("Ryan", "Bills", "7C"), subjects);
        pupilSubjects.put(new Pupil("Amanda", "Fridge", "6A"), subjects);


        pupilsGradeFromSubject = new HashMap<>();
        pupilsGradeFromSubject.put(new Pupil("Phillip", "Rogers", "5A"), new ArrayList<>());


    }

    public Set<Pupil> getAllPupils() {
        return pupils;
    }

    public Set<Subject> getAllSubjects() {
        return subjects;
    }

    public Set<Subject> getPupilSubjects(Pupil pupil) {

        return pupilSubjects.get(pupil);
    }

    public List<Grade> getPupilGrades(Pupil pupil, Subject subject) {
        List<SubjectGrades> subjectsWithGrades = pupilsGradeFromSubject.get(pupil);
        ;


        if (subjectsWithGrades == null) {
            System.out.printf("Student [%s] is not assigned to subject [%s]%n", pupil, subject);
            return List.of();
        }
        // find right subject
        for (SubjectGrades subjectGrades : subjectsWithGrades) {
            if (subjectGrades.getSubject().equals(subject)) {
                return subjectGrades.getGrades();
            }
        }
        return List.of();
    }
}

