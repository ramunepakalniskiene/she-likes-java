package com.sda.she_likes_java.FinalProject.repsitory;

import com.sda.she_likes_java.FinalProject.entity.User;
import com.sda.she_likes_java.FinalProject.exception.InexperiencedUserException;
import org.h2.expression.function.CurrentDateTimeValueFunction;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static long userCounter;
    private Map<Long, User> users;

    public UserRepository() {
        this.users = new HashMap<>();
    }

    public void registerNewUser(String name,
                                String surname,
                                LocalDate age,
                                String logging,
                                String password,
                                LocalDate drivingLicenceIssueDate) throws InexperiencedUserException {
        //check if user is eligible to register
        checkDrivingLicence(drivingLicenceIssueDate);
        //get users ID
        Long id = nextId();
        //register new user
        registerNewUser(name, surname, age, logging, password, drivingLicenceIssueDate, id);


    }

    private void registerNewUser(String name, String surname, LocalDate age, String logging, String password, LocalDate drivingLicenceIssueDate, Long id) {
        User newUser = new User(id, name, surname, age, logging, password, drivingLicenceIssueDate);
        users.put(id, newUser);
    }

    private void checkDrivingLicence(LocalDate drivingLicenceIssueDate) throws InexperiencedUserException {
        //at least 3years
        final int minYearsOFExperience = 3;
        LocalDate currentDate = LocalDate.now();
        LocalDate boundaryDate = drivingLicenceIssueDate.plusYears(minYearsOFExperience);
        if (boundaryDate.isAfter(currentDate)) {
            throw new InexperiencedUserException("Better buy a bicycle!");
        }

    }

    private static long nextId() {
        return ++userCounter;
    }

    public void deleteUser() {

    }

    public List<User> listAllUsers() {
        return List.of();
    }

    public void updateUser(User user) {

    }

    public List<User> getUsersBasedOnCriteria() {
        return List.of();
    }

    public List<User> getOrderedUsers(Comparator<User> comparator) {
        return List.of();
    }
}

