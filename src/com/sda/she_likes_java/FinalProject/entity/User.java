package com.sda.she_likes_java.FinalProject.entity;

import java.time.LocalDate;
import java.util.Objects;

// records - usefull only the variables are final
public record User(String name, String surname, LocalDate age, String logging, String password,
                   LocalDate drivingLicenceIssueDate) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(age, user.age) && Objects.equals(logging, user.logging) && Objects.equals(password, user.password) && Objects.equals(drivingLicenceIssueDate, user.drivingLicenceIssueDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", logging='" + logging + '\'' +
                ", password='" + password + '\'' +
                ", drivingLicenceIssueDate=" + drivingLicenceIssueDate +
                '}';
    }
}



