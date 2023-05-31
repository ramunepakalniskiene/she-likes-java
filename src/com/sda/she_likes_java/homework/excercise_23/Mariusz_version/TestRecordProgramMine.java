package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.Connection;

import static com.sda.she_likes_java.homework.excercise_23.Mariusz_version.DatabaseUtilsPupil.getConnectionPupils;


public class TestRecordProgramMine {
    public static void main(String[] args) {
        Connection connection = getConnectionPupils();
        System.out.println(" Got connection? " + (connection != null));
        TestRecordRepositoryMine recordRepository = new TestRecordRepositoryMine(connection);
        recordRepository.getAllTestRowsFromDB();

        System.out.println("Let's store some data");
        TestRecordMine newRecord = new TestRecordMine(1, "Aaron", "Jones", "5B");
        recordRepository.storeTestRecordIntoDataBase(newRecord);

        System.out.println("Reading data from db after insert");
        recordRepository.getAllTestRowsFromDB();
    }

}
