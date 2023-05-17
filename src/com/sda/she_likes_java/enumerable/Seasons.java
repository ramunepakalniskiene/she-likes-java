package com.sda.she_likes_java.enumerable;

// enum is class with restricted number of instances
public enum Seasons {

    WINTER(-10, "skiing"),
    SPRING(8, "cycling"),
    SUMMER(25, "swimming"),
    AUTUMN(10, "sleeping");

    private int averageTemperature;
    private String activity;

    public String getActivity() {
        return activity;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    Seasons(int averageTemperature, String activity) {
        this.averageTemperature = averageTemperature;
        this.activity = activity;
    }
}
