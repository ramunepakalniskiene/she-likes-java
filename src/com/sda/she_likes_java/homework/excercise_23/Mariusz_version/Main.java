package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;


import java.util.*;

import static com.sda.she_likes_java.homework.excercise_23.Mariusz_version.Pupil.createPupil;

public class Main {
    public static void main(String[] args) {
        //creating classroomJournal object
        ClassroomJournal classroomJournal = new ClassroomJournal();

        //creating some pupils in Main
        Pupil firstPupil = new Pupil("Aaron", "Jones", "7B");
        Pupil secondPupil = new Pupil("Tom", "Rogers", "5A");
        Pupil thirdPupil = new Pupil("Melisa", "Core", "6C");
        Pupil fourthPupil = new Pupil("James", "Collin", "5B");
        Pupil fithPupil = new Pupil("Ryan", "Bills", "7C");
        Pupil sixthPupil = new Pupil("Amanda", "Fridge", "6A");

        // creating pupils Set
        Set<Pupil> allPupilsSet = new HashSet<>();
        allPupilsSet.add(firstPupil);
        allPupilsSet.add(secondPupil);
        allPupilsSet.add(thirdPupil);
        allPupilsSet.add(fourthPupil);
        allPupilsSet.add(fithPupil);
        allPupilsSet.add(sixthPupil);

        //  Creating some subjects in Main
        Subject english = new Subject("English");
        Subject lithuanian = new Subject("Lithuanian");
        Subject chemistry = new Subject("Chemistry");

        // Creating Set of subjects
        Set<Subject> allSubjects = new HashSet<>();
        allSubjects.add(english);
        allSubjects.add(lithuanian);
        allSubjects.add(chemistry);

        //putting Pupil+Subject into Map
        Map<Pupil, Set<Subject>> allPupilsSubjects = new HashMap<>();
        allPupilsSubjects.put(firstPupil, allSubjects);
        allPupilsSubjects.put(secondPupil, allSubjects);
        allPupilsSubjects.put(thirdPupil, allSubjects);
        allPupilsSubjects.put(fourthPupil, allSubjects);
        allPupilsSubjects.put(fithPupil, allSubjects);
        allPupilsSubjects.put(sixthPupil, allSubjects);

        System.out.println("Printing out allPupilsSubjects " + allPupilsSubjects);
        System.out.println("----------------");

        // creating SubjectGrades 3 objects
        SubjectGrades subjectGradesEnglish = new SubjectGrades(english);
        SubjectGrades subjectGradesLithuanian = new SubjectGrades(lithuanian);
        SubjectGrades subjectGradesChemistry = new SubjectGrades(chemistry);

        //-----Checking output-----
        System.out.println(subjectGradesEnglish.getGrades());
        System.out.println(subjectGradesLithuanian.getGrades());
        System.out.println(subjectGradesChemistry.getSubject());


        // creating SubjectGrades List
        List<SubjectGrades> allSubjectGrades = new ArrayList<>();
        allSubjectGrades.add(0, subjectGradesEnglish);
        allSubjectGrades.add(0, subjectGradesLithuanian);
        allSubjectGrades.add(0, subjectGradesChemistry);
        System.out.println("All subjectGrades: " + allSubjectGrades);

        Map<Pupil, List<SubjectGrades>> pupilsGradeFromSubject = new HashMap<>();
        pupilsGradeFromSubject.put(firstPupil, allSubjectGrades);
        pupilsGradeFromSubject.put(secondPupil, allSubjectGrades);
        pupilsGradeFromSubject.put(thirdPupil, allSubjectGrades);
        pupilsGradeFromSubject.put(fourthPupil, allSubjectGrades);
        pupilsGradeFromSubject.put(fithPupil, allSubjectGrades);
        pupilsGradeFromSubject.put(sixthPupil, allSubjectGrades);

        System.out.println("Printing out all Pupil+Subjects+Grades" + pupilsGradeFromSubject.entrySet());
        System.out.println(pupilsGradeFromSubject.get(sixthPupil)); // no grades assigned, so returned null
    }

}

