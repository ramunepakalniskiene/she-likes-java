package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionUtils {
    public static Connection getConnection(String dbUrl, String userName, String password) {
        try {
            return DriverManager.getConnection(dbUrl, userName, password);

        } catch (SQLException e) {
            System.out.println("Exception occurred during database connection: " + e);
            return null;
        }
    }
}
