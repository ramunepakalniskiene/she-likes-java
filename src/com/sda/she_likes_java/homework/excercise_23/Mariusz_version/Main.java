package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        //creating some pupils in Main - OK
        Pupil firstPupil = new Pupil("Aaron", "Jones", "7B");
        Pupil secondPupil = new Pupil("Tom", "Rogers", "5A");
        Pupil thirdPupil = new Pupil("Melisa", "Core", "6C");
        Pupil fourthPupil = new Pupil("James", "Collin", "5B");
        Pupil fifthPupil = new Pupil("Ryan", "Bills", "7C");
        Pupil sixthPupil = new Pupil("Amanda", "Fridge", "6A");

        // creating pupils Set -OK
        Set<Pupil> allPupilsSet = new HashSet<>();
        allPupilsSet.add(firstPupil);
        allPupilsSet.add(secondPupil);
        allPupilsSet.add(thirdPupil);
        allPupilsSet.add(fourthPupil);
        allPupilsSet.add(fifthPupil);
        allPupilsSet.add(sixthPupil);
        System.out.println("Printing all pupil set " + allPupilsSet);
        System.out.println("=======================================");

        //  Creating some subjects in Main - OK
        Subject english = new Subject("English");
        Subject lithuanian = new Subject("Lithuanian");
        Subject chemistry = new Subject("Chemistry");


        // Creating Set of subjects - OK
        Set<Subject> allSubjects = new HashSet<>();
        allSubjects.add(english);
        allSubjects.add(lithuanian);
        allSubjects.add(chemistry);
        System.out.println("Printing out set of subjects" + allSubjects);
        System.out.println("=========================================");

        SubjectGrades englishGrades = new SubjectGrades(english);
        SubjectGrades lithuanianGrades = new SubjectGrades(lithuanian);
        SubjectGrades chemistryGrades = new SubjectGrades(chemistry);

        englishGrades.addGrade(new Grade(10));
        englishGrades.addGrade(new Grade(10));
        englishGrades.addGrade(new Grade(10));
        lithuanianGrades.addGrade(new Grade(7));
        lithuanianGrades.addGrade(new Grade(7));
        lithuanianGrades.addGrade(new Grade(7));
        chemistryGrades.addGrade(new Grade(5));
        chemistryGrades.addGrade(new Grade(5));
        chemistryGrades.addGrade(new Grade(5));

        System.out.println("Grades eng" + englishGrades);
        System.out.println("Grades lith" + lithuanianGrades);
        System.out.println("Grades chem" + chemistryGrades);

        List<SubjectGrades> listOfSubjectGrades = new ArrayList<>();
        listOfSubjectGrades.add(0, englishGrades);
        listOfSubjectGrades.add(1, lithuanianGrades);
        listOfSubjectGrades.add(2, chemistryGrades);
        System.out.println("===============================");

        // Creating pupilSubject
        Map<Pupil, Set<Subject>> pupilSubject = new HashMap<>();
        pupilSubject.put(firstPupil, allSubjects);
        pupilSubject.put(secondPupil, allSubjects);
        pupilSubject.put(thirdPupil, allSubjects);
        pupilSubject.put(fourthPupil, allSubjects);
        pupilSubject.put(fifthPupil, allSubjects);
        pupilSubject.put(sixthPupil, allSubjects);
        System.out.println("PupilSubject" + pupilSubject);
        System.out.println("=================================");

        //Creating pupilsGradeFromSubject -
        Map<Pupil, List<SubjectGrades>> pupilsGradeFromSubject = new HashMap<>();
        pupilsGradeFromSubject.put(firstPupil, listOfSubjectGrades);
        pupilsGradeFromSubject.put(secondPupil, listOfSubjectGrades);
        pupilsGradeFromSubject.put(thirdPupil, listOfSubjectGrades);
        pupilsGradeFromSubject.put(fourthPupil, listOfSubjectGrades);
        pupilsGradeFromSubject.put(fifthPupil, listOfSubjectGrades);
        pupilsGradeFromSubject.put(sixthPupil, listOfSubjectGrades);
        System.out.println("Pupil grade from subject" + pupilsGradeFromSubject);

    }
}