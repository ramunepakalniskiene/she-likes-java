package com.sda.she_likes_java.homework.excercise_26;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public enum ImportantEvents {
    MOST_IMPORTANT(LocalDate.of(1982, 12, 28), "I was born"),
    VERY_IMPORTANT(LocalDate.of(2011, 11, 12), "Birthday of my first child"),
    ANTICIPATED_EVENT(LocalDate.of(2006, 3, 8), "Entered my new house");
    private LocalDate date;
    private String description;

    ImportantEvents(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
