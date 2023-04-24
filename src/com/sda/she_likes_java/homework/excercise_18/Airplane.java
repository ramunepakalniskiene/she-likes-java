package com.sda.she_likes_java.homework.excercise_18;

public class Airplane {
    private int xCoordinates;
    private int yCoordinates;
    boolean isFlying;

    public Airplane(int xCoordinates, int yCoordinates, boolean isFlying) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.isFlying = isFlying;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }

    public void takeOff() {
        if (xCoordinates == 0 && yCoordinates > 0) {
            System.out.println("Taking off");
        }
    }

    public void land() {
        if (xCoordinates > 0) {
            System.out.println("Time to land");
        }

    }

    public void flyTo(int xCoordinates, int yCoordinates) {
        takeOff();
    }


    public void currentStateOfAirplane() {
        if (xCoordinates == 0 && yCoordinates == 0) {
            System.out.println("The airplane is in the hangar");
        }
        if (xCoordinates > 0 && yCoordinates > 0) {
            System.out.println("The airplane is in the air");
        } else if (xCoordinates < 100 && yCoordinates < 100) {
            System.out.println("The plane is landing!");
        }
    }

}
