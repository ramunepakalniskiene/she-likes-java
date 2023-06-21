package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.Connection;
import java.util.List;

import static com.sda.she_likes_java.homework.excercise_23.Mariusz_version.DatabaseUtilsPupil.getConnectionPupils;


public class PupilRecordProgramMine {
    public static void main(String[] args) {
        Connection connection = getConnectionPupils();
        System.out.println(" Got connection? " + (connection != null));
        // first method
        PupilRepository.preparePupilData(connection);

        //second method
        PupilRepository pupilRepository = new PupilRepository(connection);
        List<Pupil> pupils = pupilRepository.getAllPupils();
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
        //third method
        pupilRepository.storePupilRecordIntoDataBase(new Pupil("Collin", " Berns", " 6B"));


    }

}
