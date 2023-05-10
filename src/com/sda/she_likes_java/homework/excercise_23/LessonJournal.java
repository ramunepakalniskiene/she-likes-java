package com.sda.she_likes_java.homework.excercise_23;


import java.util.*;

public class LessonJournal {
  public static void main(String[] args) {
    Map<Pupil, Subject> lessonJournal = new HashMap<>();
    lessonJournal.put(new Pupil("Reynold", "Halls"), new Subject("geography", new int[]{3, 4, 6, 7, 8}));
    lessonJournal.put(new Pupil("Ronan", "Ford"), new Subject("biology", new int[]{10, 10, 9, 8, 10}));
    lessonJournal.put(new Pupil("Rey", "Bills"), new Subject("math", new int[]{5, 5, 7, 8, 9}));
    lessonJournal.put(new Pupil("Milana", "Holls"), new Subject("chemistry", new int[]{3, 4, 6, 7, 8}));
    lessonJournal.put(new Pupil("Aaron", "Collins"), new Subject("geography", new int[]{3, 4, 6, 7, 8}));


    System.out.println("The list is:" + lessonJournal);
    listOfPupils(lessonJournal);
    listOfSubject(lessonJournal);


  }

  public static void listOfPupils(Map<Pupil, Subject> allPupils) {
    for (Map.Entry<Pupil, Subject> list : allPupils.entrySet()) {
      System.out.println("List of pupils is: " + list.getKey());
    }

  }

  public static void listOfSubject(Map<Pupil, Subject> allPupils) {
    for (Map.Entry<Pupil, Subject> list : allPupils.entrySet()) {
      System.out.println("List of subject is: " + list.getValue());


//        Set<Pupil> pupils= new HashSet<>();
//        pupils.add());
//        pupils.add(new Pupil());
//        pupils.add(new Pupil());
//        pupils.add(new Pupil("Aaron", "Collins"));
//        pupils.add(new Pupil("Suzanne", "Oxford"));
//        pupils.add(new Pupil("Rudolf", "King"));
//        pupils.add(new Pupil("Catherine", "Holms"));
//
//        System.out.println("The list of pupils: " + pupils);
//
//        System.out.println("");


    }
  }
}


