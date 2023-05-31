package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//CRUD means
//Create
//Read
//Update
//Delete
public class AccentureStudentsRepository {
    private static final String allStudentsQuery = """
            SELECT ID, NAME, SURNAME, AGE,  SEX
            FROM STUDENTS;
            """;
    private Connection dbConn;

    public AccentureStudentsRepository(Connection dbConn) {
        this.dbConn = dbConn;
    }

    public List<AccentureStudent> getAllStudents() {
        List<AccentureStudent> result = new ArrayList<>();
        try {
            Statement statement = dbConn.createStatement();
            ResultSet recordsFromDb = statement.executeQuery(allStudentsQuery);
            while (recordsFromDb.next()) {
                Integer id = recordsFromDb.getInt("ID");
                String name = recordsFromDb.getString("Name");
                String surname = recordsFromDb.getString("Surname");
                int age = recordsFromDb.getInt("Age");
                String sex = recordsFromDb.getString("Sex");
                AccentureStudent student = new AccentureStudent(id, name, surname, age, sex);
                result.add(student);
            }

        } catch (SQLException e) {
            System.out.println("Unexpected error" + e);
        }
        return result;
    }

    public AccentureStudent getStudentByID(Long id) {
        return null;
    }

    public AccentureStudent saveStudent(AccentureStudent student) {
        return null;
    }

    public boolean deleteStudentByID(Long id) {
        return true;
    }

    public AccentureStudent updateStudent(AccentureStudent student) {
        return null;
    }

}