package com.sda.she_likes_java.enumerable;

public enum ProgrammersStates {
    EXHAUSTED_MODE("Bang the wall"),
    GOD_MODE("I can do everything"),
    NORMAL("It's just life");
    String description;


    public String getDescription() {
        return description;
    }

    ProgrammersStates(String description) {
        this.description = description;
    }
}
