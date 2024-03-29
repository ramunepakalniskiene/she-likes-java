package com.sda.she_likes_java.database;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestRecordRepository {
    private static final String allTestRecordsQuery = """
            SELECT ID, NAME,
            FROM TEST
            """;
    private static final String addRecordQuery = """
            INSERT INTO TEST(ID, NAME)
            VALUES(?, ?);
            """;
    private Connection dbConnection;

    public TestRecordRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<TestRecord> getAllTestRowsFromDB() {
        List<TestRecord> records = new ArrayList<>();
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
                String titleFomDb = results.getString("Name");
                TestRecord recordFromDb = new TestRecord(idFromDb, titleFomDb);
                records.add(recordFromDb);
                System.out.println("ID: " + idFromDb + ", Title " + titleFomDb);
            }
        } catch (SQLException e) {
            System.out.println("Unexpected exception" + e);

        }

        return records;
    }

    public boolean storeTestRecordIntoDataBase(TestRecord dataToStore) {
        try {
            PreparedStatement preparedStatement = dbConnection.prepareStatement(addRecordQuery);
            preparedStatement.setInt(1, dataToStore.getId());
            preparedStatement.setString(2, dataToStore.getTitle());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Unexpected exception " + e);
            return false;
        }
        return true;
    }
}
