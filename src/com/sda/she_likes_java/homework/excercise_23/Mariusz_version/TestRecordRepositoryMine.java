package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
//DROP TABLE IF EXISTS PUPIL
//  CCREATE TABLE PUPIL
//(
//    ID INTEGER PRIMARY KEY, AUTOINCREMENT,
//    NAME VARCHAR(255) NOT NULL,
//    SURNAME VARCHAR(255) NOT NULL,
//    CURRENT_CLASS VARCHAR(255) NOT NULL);
//          CURRENT_CLASS VARCHAR(255) NOT NULL);
public class TestRecordRepositoryMine {
//    private static final String createTableQuery= """


    //            """;
    private static final String insertDataQuery = """
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Aaron', 'Jones','7B');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Tom', 'Rogers', '5A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Melisa', 'Core', '6A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('James', 'Collin', '5A');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Ryan', 'Bills', '7B');
            INSERT INTO PUPIL(NAME, SURNAME, CURRENT_CLASS) VALUES ('Amanda', 'Fridge', '6A');
                 
            """;
    private static final String allTestRecordsQuery = """
            SELECT ID, NAME, SURNAME, CURRENT_CLASS
            FROM PUPIL
            """;
    private static final String addRecordQuery = """
            INSERT INTO PUPIL(ID, NAME, SURNAME, CURRENT_CLASS)
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
            //statement.execute(createTableQuery);
            statement.execute(insertDataQuery);
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
