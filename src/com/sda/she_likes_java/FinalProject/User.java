package com.sda.she_likes_java.FinalProject;

import java.time.LocalDate;
import java.util.Objects;

// records - usefull only the variables are final
public record User(String name, String surname, LocalDate age, String logging, String password,
                   LocalDate drivingLicenceIssueDate) {


}
