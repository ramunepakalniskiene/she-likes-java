package com.sda.she_likes_java.objects;

import javax.crypto.spec.PSource;

public class HouseExample {
    public static void main(String[] args) {


        House myHouse = new House(4, 2);
        System.out.println("I've got a new house: " + myHouse);
        myHouse.setNumberOfRooms(10);
        System.out.println("Setter was used to set a new quantity of rooms: I've got a new house: " + myHouse + "get numbers of rooms separately using getter: "+ myHouse.getNumberOfRooms());

    }
}
