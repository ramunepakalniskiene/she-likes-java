package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        //creating classroomJournal object
        ClassroomJournal classroomJournal = new ClassroomJournal();
        // printing out all pupils and objects created in ClassroomJournal
        System.out.println(("Printing out list of pupil created in CJ clas: " + classroomJournal.getAllPupils()));
        System.out.println("Printing out list Subject from CJ class: " + classroomJournal.getAllSubjects());

        //creating some pupils in Main
        Pupil firstPupil = new Pupil("Aaron", "Jones", "7B");
        Pupil secondPupil = new Pupil("Tom", "Rogers", "5A");
        Pupil thirdPupil = new Pupil("Melisa", "Core", "6C");
        Pupil fourthPupil = new Pupil("James", "Collin", "5B");
        Pupil fithPupil = new Pupil("Ryan", "Bills", "7C");
        Pupil sixthPupil = new Pupil("Amanda", "Fridge", "6A");

        //adding pupils to list
        List<Pupil> allPupilsCreatedInMain = new ArrayList<>();
        allPupilsCreatedInMain.add(firstPupil);
        allPupilsCreatedInMain.add(secondPupil);
        allPupilsCreatedInMain.add(thirdPupil);
        allPupilsCreatedInMain.add(fourthPupil);
        allPupilsCreatedInMain.add(fithPupil);
        allPupilsCreatedInMain.add(sixthPupil);
        // sorting pupils by surename from outside class
        Collections.sort(allPupilsCreatedInMain, new ComparatorPupil());
        System.out.println(allPupilsCreatedInMain);


        System.out.println("List of pupil from Main: " + allPupilsCreatedInMain);
        System.out.println("-------------------");

        //  Creating some subjects in Main
        Subject english = new Subject("English");
        Subject lithuanian = new Subject("Lithuanian");
        Subject chemistry = new Subject("Chemistry");

        // adding subjects from Main to list
        List<Subject> allSubjectsMain = new ArrayList<>();
        allSubjectsMain.add(english);
        allSubjectsMain.add(lithuanian);
        allSubjectsMain.add(chemistry);

        System.out.println("List of all Subjects form Main: " + allSubjectsMain);
        System.out.println("List of all Subjects form ClassJournal: " + classroomJournal.getAllSubjects());
        System.out.println("-------------------");

        List<SubjectGrades> subjectGrades = new ArrayList<>();
        subjectGrades.add(0, new SubjectGrades(english));
        subjectGrades.add(0, new SubjectGrades(lithuanian));
        subjectGrades.add(0, new SubjectGrades(chemistry));
        System.out.println("The list is of subject grades Main: " + subjectGrades);
        System.out.println("--------------------");


        System.out.println(classroomJournal.getPupilSubjects(sixthPupil));
        System.out.println(classroomJournal.getPupilGrades(sixthPupil, chemistry));
        System.out.println(classroomJournal.getAllSubjects());
        System.out.println(classroomJournal.getAllPupils());

//        System.out.println("The list of subject grades ClassJournal is: " + classroomJournal.getPupilGrades(firstPupil,chemistry));
//        System.out.println(classroomJournal.getPupilGrades(firstPupil,english));

//
//        System.out.println(classroomJournal.getPupilGrades(new Pupil("j", "m", "6C"), chemistry));
//        classroomJournal.getPupilGrades(firstPupil, lithuanian);
//        classroomJournal.getPupilGrades(secondPupil, english);
//        System.out.println(firstPupil);


    }
}
