package com.sda.she_likes_java.homework.excercise_18;

import java.sql.SQLOutput;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane airplane01 = new Airplane(500, 0, true);
        Airplane airplane02 = new Airplane(0, 100, false);

        airplane01.setxCoordinates(0);
        airplane01.setyCoordinates(200);

        System.out.println(airplane01.getxCoordinates());
//        airplane01.currentStateOfAirplane();
//        airplane02.currentStateOfAirplane();

        airplane02.takeOff();

    }
}
