package com.sda.she_likes_java.homework.excercise_23.Mariusz_version;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtilsPupil {
    /**
     * Script for creating table
     * CREATE TABLE TEST
     * (ID INT PRIMARY KEY, NAME VARCHAR(255));
     * <p>
     * script for inserting one record or row into table
     * INSERT INTO TEST(ID, NAME)
     * VALUES(1, 'Ramune');
     * <p>
     * script for reading
     * SELECT ID, NAME
     * FROM TEST;
     * <p>
     * script for updating data
     * UPDATE TEST
     * SET NAME='Kitija'
     * WHERE ID=5;
     * <p>
     * script for deleting data
     * DELETE
     * FROM TEST
     * WHERE  ID=6;
     */

    // handle internally
    public static Connection getConnectionPupils() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:C:/Users/User/Desktop/IT/she-likes-java/accenture");
        } catch (SQLException e) {
            System.out.println("Exception occurred during database connection: " + e);
            return null;
        }
    }

    //   declare
    public static Connection getConnectionButSometimesThowException() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:C:/Users/User/Desktop/IT/she-likes-java/accenture");
    }
//    public static Connection getConnection() {
//        try {
//            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
//                    "sa",
//                    "sa");
//        } catch (SQLException e) {
//            return null;
//        }
//    }
//
//    // declare
//    public static Connection getConnectionButSometimesThrowException() throws SQLException {
//        return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
//                "sa",
//                "sa");
//    }

}
