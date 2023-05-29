package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection1 = DatabaseUtils.getConnection();

        try {
            DatabaseUtils.getConnectionButSometimesThowException();
        } catch (SQLException e) {
            System.out.println("I need to handle it!!");
        }

    }
}
