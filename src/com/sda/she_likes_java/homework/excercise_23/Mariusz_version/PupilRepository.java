package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PupilRepository {
    private static final String createTablePupilQuery = """
            CREATE TABLE PUPIL
            (
            ID INTEGER PRIMARY KEY AUTOINCREMENT,
            NAME VARCHAR(255) NOT NULL,
            SURNAME VARCHAR(255) NOT NULL,
            CURRENT_CLASS VARCHAR(255) NOT NULL);
            """;
    private static final String insertPupilDataQuery = """
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Aaron', 'Jones','7B');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Tom', 'Rogers', '5A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Melisa', 'Core', '6A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('James', 'Collin', '5A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Ryan', 'Bills', '7B');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Amanda', 'Fridge', '6A');
            """;
    private static final String allPupilQuery = """
            SELECT * FROM PUPIL
            """;

    private static final String addPupilRecordQuery = """
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS)
            VALUES(?, ?, ?);
            """;
    private Connection dbConn;

    public PupilRepository(Connection dbConn) {
        this.dbConn = dbConn;
    }

    public static void preparePupilData(Connection dbConn) {
        try {
            Statement statement = dbConn.createStatement();
//            statement.execute(createTablePupilQuery);
            statement.execute(insertPupilDataQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pupil> getAllPupils() {
        List<Pupil> result = new ArrayList<>();
        try {
//            dbConn.setAutoCommit(false);
            Statement statement = dbConn.createStatement();
//            statement.execute(createTablePupilQuery);
//            statement.executeQuery(insertPupilDataQuery);
//            statement.executeQuery(addPupilRecordQuery);
            ResultSet recordsFromDbMine = statement.executeQuery(allPupilQuery);
            while (recordsFromDbMine.next()) {
                int id = recordsFromDbMine.getInt("Id");
                String name = recordsFromDbMine.getString("Name");
                String surname = recordsFromDbMine.getString("Surname");
                String current_class = recordsFromDbMine.getString("Current_Class");
                Pupil pupilFromDb = new Pupil(name, surname, current_class);
                result.add(pupilFromDb);
                System.out.println("ID" + id + ",Name " + name + ", Surname " + surname + ", Current_Class " + current_class);

            }
//            dbConn.commit();
        } catch (SQLException e) {
            try {
                dbConn.rollback();
            } catch (SQLException ex) {
                System.out.println("Unexpected error" + e);
            }

        }
        return result;
    }

    public Pupil storePupilRecordIntoDataBase(Pupil dataToStore) {
        try {
            PreparedStatement preparedStatement = dbConn.prepareStatement(addPupilRecordQuery);
//            preparedStatement.setInt(1, dataToStore.getId());
            preparedStatement.setString(1, dataToStore.getName());
            preparedStatement.setString(2, dataToStore.getSurname());
            preparedStatement.setString(3, dataToStore.getCurrentClass());

            int numberOfInsertedRecords = preparedStatement.executeUpdate();
            ResultSet generatedId = preparedStatement.getGeneratedKeys();
            while (generatedId.next()) {
                Integer id = generatedId.getInt("Id");
                dataToStore.setId(id);
            }

        } catch (SQLException e) {

        }
        System.out.println("Inserted student is " + dataToStore);
        return dataToStore;
    }

}
