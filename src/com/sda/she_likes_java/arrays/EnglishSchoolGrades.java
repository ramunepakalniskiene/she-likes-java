package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    public static void main(String[] args) {
        int[]myGradesOnEnglishClass = new int[10];

        Random gradesGenerator = new Random(7);
        for( int i =0; i<myGradesOnEnglishClass.length; i++){
            myGradesOnEnglishClass[i]=gradesGenerator.nextInt(7);
        }
        for (int i = 0; i<myGradesOnEnglishClass.length; i++){
            System.out.println("my grade on i number: " + i + " is: " + myGradesOnEnglishClass[i]);
        }
    }
}
