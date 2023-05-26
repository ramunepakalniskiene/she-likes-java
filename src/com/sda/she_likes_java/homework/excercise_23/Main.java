package com.sda.she_likes_java.homework.excercise_23;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Pupil firstPupil = new Pupil("Tomas", "Ramanauskas");
        Pupil secondPupil = new Pupil("Domas", "Kulikauskas");
        Pupil thirdPupil = new Pupil("Lina", "Gailaite");
        Pupil fourthPupil = new Pupil("Sima", "Lukosiute");


        Set<Pupil> pupilSet = new HashSet<>();
        pupilSet.add(firstPupil);
        pupilSet.add(secondPupil);
        pupilSet.add(thirdPupil);
        pupilSet.add(fourthPupil);
        System.out.println(pupilSet);
    }
}
