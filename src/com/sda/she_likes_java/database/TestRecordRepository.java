package com.sda.she_likes_java.database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestRecordRepository {
    private static final String allTestRecordsQuery = """
            SELECT ID, NAME,
            FROM TEST
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
                Integer idFromDb = results.getInt(" ID");
                String titleFomDb = results.getString(" Name");
                TestRecord recordFromDb = new TestRecord(idFromDb, titleFomDb);
                records.add(recordFromDb);
                System.out.println("ID" + results.getInt("ID") + "Title " + results.getString("Title"));
            }
        } catch (SQLException e) {
            System.out.println("Unexpected exception" + e);
            ;
        }

        return records;
    }
}
