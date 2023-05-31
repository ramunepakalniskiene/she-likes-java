package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.util.List;

public class PupilRepository {
    private static final String allPupilQuery = """
            SELECT ID, NAME, SURNAME, CURRENT_CLASS
            FROM Pupil""";
    private static final String findPupilByID = """
            SELECT ID, NAME, SURNAME, CURRENT_CLASS
            FROM Pupil
            WHERE ID =%s""";

    public static List<Pupil> getAllPupils() {
        return List.of();
    }
}
