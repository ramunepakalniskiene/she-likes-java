package com.sda.she_likes_java.homework.excercise_18;

import java.sql.SQLOutput;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane= new Airplane(500,0);

        airplane.setxCoordination(0);
        airplane.setyCoordination(200);

        System.out.println(airplane.getxCoordination());
        if (airplane.getxCoordination()>0){
            System.out.println("The airplane is in the air");
        } else{
            System.out.println("The airplane is in hangar");
        }
    }
}
