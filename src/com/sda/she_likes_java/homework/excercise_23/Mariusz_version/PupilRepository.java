package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PupilRepository {
    private static final String allPupilQuery = """
            SELECT ID, NAME, SURNAME, CURRENT_CLASS
            FROM PUPIL""";
    private Connection dbConn;

    public PupilRepository(Connection dbConn) {
        this.dbConn = dbConn;
    }

    public List<Pupil> getAllPupils() {
        List<Pupil> result = new ArrayList<>();
        try {
            Statement statement = dbConn.createStatement();
            ResultSet recordsFromDbMine = statement.executeQuery(allPupilQuery);
            while (recordsFromDbMine.next()) {
                Integer id = recordsFromDbMine.getInt("ID");
                String name = recordsFromDbMine.getString("Name");
                String surname = recordsFromDbMine.getString("Surname");
                String current_class = recordsFromDbMine.getString("Current_Class");
                Pupil pupilRepository = new Pupil(id, name, surname, current_class);
                result.add(pupilRepository);

            }

        } catch (SQLException e) {
            System.out.println("Unexpected error" + e);
        }
        return result;
    }


}
