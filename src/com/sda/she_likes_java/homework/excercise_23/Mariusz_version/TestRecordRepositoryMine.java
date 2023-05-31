package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestRecordRepositoryMine {
    private static final String allTestRecordsQuery = """
            SELECT ID, NAME, SURNAME, CURRENT_CLASS
            FROM Pupil
            """;
    private static final String addRecordQuery = """
            INSERT INTO Pupil(ID, NAME, SURNAME, CURRENT_CLASS)
            VALUES(?, ?, ?, ?);
            """;
    private Connection dbConnection;

    public TestRecordRepositoryMine(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<TestRecordMine> getAllTestRowsFromDB() {
        List<TestRecordMine> records = new ArrayList<>();
        // sent query to database
        try {
            // statement - current query
            Statement statement = dbConnection.createStatement();
            // get result
            // resultSet - like a small table with a data
            ResultSet results = statement.executeQuery(allTestRecordsQuery);
            // map results to java objects - TestRecord
            while (results.next()) {
                Integer idFromDb = results.getInt("ID");
                String nameFromDb = results.getString("Name");
                String surnameFromDb = results.getString("Surname");
                String currentClassFromDb = results.getString("Current_Class");

                TestRecordMine recordFromDbMine = new TestRecordMine(idFromDb, nameFromDb, surnameFromDb, currentClassFromDb);
                records.add(recordFromDbMine);
                System.out.println("ID: " + idFromDb + ", Name " + nameFromDb + ", Surname " + surnameFromDb + ", Current Class " + currentClassFromDb);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected exception" + e);

        }

        return records;
    }

    public boolean storeTestRecordIntoDataBase(TestRecordMine dataToStore) {
        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(addRecordQuery);
            preparedStatement.setInt(1, dataToStore.getId());
            preparedStatement.setString(2, dataToStore.getName());
            preparedStatement.setString(3, dataToStore.getSurname());
            preparedStatement.setString(4, dataToStore.getCurrentClass());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Unexpected exception " + e);
            return false;
        }
        return true;
    }
}
