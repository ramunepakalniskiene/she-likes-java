package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.Connection;
import java.util.List;

import static com.sda.she_likes_java.homework.excercise_23.Mariusz_version.DatabaseUtilsPupil.getConnectionPupils;


public class TestRecordProgramMine {
    public static void main(String[] args) {
        Connection connection = getConnectionPupils();
        System.out.println(" Got connection? " + (connection != null));
        TestRecordRepositoryMine recordRepository = new TestRecordRepositoryMine(connection);
        List<TestRecordMine> pupils = recordRepository.getAllTestRowsFromDB();
//        for(TestRecordMine mine: pupils){
//            System.out.println("Pupils from DB" + pupils) ;
//
//        }

        recordRepository.getAllTestRowsFromDB();

        System.out.println("Let's store some data");
        TestRecordMine newRecord = new TestRecordMine(8, "Melinda", "Jobs", "6B");
        recordRepository.storeTestRecordIntoDataBase(newRecord);
        System.out.println(newRecord);

        System.out.println("Reading data from db after insert");
        recordRepository.storeTestRecordIntoDataBase(pupils.get(5));
    }

}
