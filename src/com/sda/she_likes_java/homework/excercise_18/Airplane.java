package com.sda.she_likes_java.homework.excercise_18;

public class Airplane {
    private int xCoordination;
    private int yCoordination;

    public Airplane(int xCoordination, int yCoordination) {
        this.xCoordination = xCoordination;
        this.yCoordination = yCoordination;
    }

    public int getxCoordination() {
        return xCoordination;
    }

    public void setxCoordination(int xCoordination) {
        this.xCoordination = xCoordination;
    }

    public int getyCoordination() {
        return yCoordination;
    }

    public void setyCoordination(int yCoordination) {
        this.yCoordination = yCoordination;
    }

    private void takeOff(){
        if(xCoordination==0|| yCoordination==100) {
            System.out.println("Taking off");
        }
    }
    private void land(){
        if (xCoordination>0){
            System.out.println("Time to land");
        }

    }
    private void flyTo(int xCoordinates, int yCoordinates) {
        takeOff();
    }


        private void currentStateOfAirplane(){
        if(xCoordination==0|| yCoordination==0){
            System.out.println("The airplane is in the hangar");

        }
        if(xCoordination>0){
            System.out.println("The airplane is in the air");
        }

    }

}
