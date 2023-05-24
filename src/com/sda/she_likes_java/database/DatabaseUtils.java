package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    // handle internaly
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc)",
                    "sa",
                    "");
        } catch (SQLException e) {
            return null;
        }
    }

    //   declare
    public static Connection getConnectionButSometimesThowException() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc)",
                "sa",
                "");
    }

}
