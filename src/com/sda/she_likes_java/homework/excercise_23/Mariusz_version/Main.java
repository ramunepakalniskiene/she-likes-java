package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClassroomJournal allPupils = new ClassroomJournal();
        Pupil firstPupil = new Pupil("Aaron", "Jones", "7B");
        Pupil secondPupil = new Pupil("Tom", "Rogers", "5A");
        Pupil thirdPupil = new Pupil("Melisa", "Core", "6C");
        Pupil fourthPupil = new Pupil("James", "Collin", "5B");
        Pupil fithPupil = new Pupil("Ryan", "Bills", "7C");
        Pupil sixthPupil = new Pupil("Amanda", "Fridge", "6A");

        Set<Pupil> allPupilSet = new HashSet<>();
        allPupilSet.add(firstPupil);
        allPupilSet.add(secondPupil);
        allPupilSet.add(thirdPupil);
        allPupilSet.add(fourthPupil);
        allPupilSet.add(fithPupil);
        allPupilSet.add(sixthPupil);
        System.out.println("List of pupil from Main: " + allPupilSet);
        System.out.println("List of pupil from ClassJournal: " + allPupils.getAllPupils());
        System.out.println("-------------------");

        Subject biology = new Subject("Biology");
        Subject english = new Subject("Chemistry");
        Subject lithuanian = new Subject("Lithuanian");
        Subject chemistry = new Subject("Chemistry");
        List<Subject> allSubjectsMain = new ArrayList<>();
        allSubjectsMain.add(biology);
        allSubjectsMain.add(english);
        allSubjectsMain.add(lithuanian);
        allSubjectsMain.add(chemistry);

        System.out.println("List of all Subjects form Main: " + allSubjectsMain);
        System.out.println("List of all Subjects form ClassJournal: " + allPupils.getAllSubjects());


        System.out.println("-------------------");
        System.out.println("List of currentClass is: ");
        System.out.println("-------------------");
        System.out.println("List of grades is: ");


        List<SubjectGrades> subjectGrades = new ArrayList<>();
        subjectGrades.add(0, new SubjectGrades(biology));
        subjectGrades.add(1, new SubjectGrades(english));
        subjectGrades.add(2, new SubjectGrades(lithuanian));
        subjectGrades.add(3, new SubjectGrades(chemistry));

        System.out.println("The list is of subject grades Main: " + subjectGrades);
        System.out.println("The list of subject grades ClassJournal is: " + allPupils.getPupilGrades((firstPupil), lithuanian));

        List<>
        System.out.println(allPupils.getPupilGrades(new Pupil("j", "m", "6C"), biology));
        allPupils.getPupilGrades(firstPupil, biology);
        allPupils.getPupilGrades(secondPupil, chemistry);


    }
}
