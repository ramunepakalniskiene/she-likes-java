package com.sda.she_likes_java.collections.map.maps_practice;

public class LessonJournal {
    private String subject;
    private int cabinetFloor;

    public LessonJournal(String subject, int cabinetFloor) {
        this.subject = subject;
        this.cabinetFloor = cabinetFloor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCabinetFloor() {
        return cabinetFloor;
    }

    public void setCabinetFloor(int cabinetFloor) {
        this.cabinetFloor = cabinetFloor;
    }

    @Override
    public String toString() {
        return "LessonJournal{" +
                "subject='" + subject + '\'' +
                ", cabinetFloor='" + cabinetFloor + '\'' +
                '}';
    }
}
