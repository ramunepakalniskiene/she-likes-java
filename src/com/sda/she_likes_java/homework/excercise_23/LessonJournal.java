package com.sda.she_likes_java.homework.excercise_23;


import java.util.*;

public class LessonJournal {
  public static void main(String[] args) {
      Map<Pupil, Subject> lessonJournal = new HashMap<>();
      lessonJournal.put(new Pupil("Reynold", "Halls"), new Subject("geography", List.of(5, 4, 3, 2)));
      lessonJournal.put(new Pupil("Ronan", "Ford"), new Subject("biology", List.of(10, 10, 9, 8, 10)));
      lessonJournal.put(new Pupil("Rey", "Bills"), new Subject("math", List.of(5, 5, 7, 8, 9)));
      lessonJournal.put(new Pupil("Milana", "Holls"), new Subject("chemistry", List.of(3, 4, 6, 7, 8)));
      lessonJournal.put(new Pupil("Aaron", "Collins"), new Subject("geography", List.of(3, 4, 6, 7, 8)));

      System.out.println("The total list is:" + lessonJournal);
      listOfPupils(lessonJournal);
      listOfSubject(lessonJournal);


  }

  public static void listOfPupils(Map<Pupil, Subject> allPupils) {
    for (Map.Entry<Pupil, Subject> list : allPupils.entrySet()) {
      System.out.println("List of pupils is: " + list.getKey());
    }

  }

    public static void listOfSubject(Map<Pupil, Subject> allPupils) {
//    for (Map.Entry<Pupil, Subject> list : allPupils.entrySet()) {
//      System.out.println("List of subject is: " + list.getValue());

    }
}


//  public static Map<Subject,List> sortOnlySubjects(Map<Pupil,Subject> allData, String subjectList) {
//    List<Subject> subjects = new ArrayList<>();
//    for (String allSubjects : allData) {
//      subjects.add(allSubjects);
//      }
//
////  return subjects;
//}
//
//    }
//  public static List<Subject> sortOnlySubjects(List<Subject> allData, Subject subject) {
//    List<Subject> subjects = new ArrayList<>();
//    for (Subject allsubjects : allData) {
//
//      if(allsubjects.getSubject().equals(subject)){
//        subjects.add(allsubjects);
//      }
//    }
//
//    return subjects;
//  }
//
