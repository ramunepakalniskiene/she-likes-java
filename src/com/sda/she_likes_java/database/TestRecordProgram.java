package com.sda.she_likes_java.database;

import java.sql.Connection;

import static com.sda.she_likes_java.database.DatabaseUtils.*;

public class TestRecordProgram {
    public static void main(String[] args) {
        Connection connection = getConnection();
        System.out.println(" Got connection? " + (connection != null));
        TestRecordRepository recordRepository = new TestRecordRepository(connection);
        recordRepository.getAllTestRowsFromDB();

        System.out.println("Let's store some data");
//        TestRecord newRecord = new TestRecord(10, "Second insert");
//        recordRepository.storeTestRecordIntoDataBase(newRecord);

        System.out.println("Reading data from db after insert");
        recordRepository.getAllTestRowsFromDB();
    }

}
