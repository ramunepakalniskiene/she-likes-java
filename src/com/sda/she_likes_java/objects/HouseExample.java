package com.sda.she_likes_java.objects;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class HouseExample {
    public static void main(String[] args) {


        House myHouse = new House(4, 2);
        System.out.println("I've got a new house: " + myHouse);
        myHouse.setNumberOfRooms(10);
        System.out.println("Setter was used to set a new quantity of rooms: I've got a new house: " + myHouse + "get numbers of rooms separately using getter: "+ myHouse.getNumberOfRooms());

        System.out.println("-----------------------");
        HouseOwner wife = new HouseOwner("Mary", myHouse);
        HouseOwner husband = new HouseOwner("John", myHouse);

        System.out.println("Mary would like to repair her house");
        wife.getHouse().setNumberOfBathrooms(3);
        System.out.println("House after renovation: "  + myHouse);

        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("House after  John renovation: "  + myHouse);

        System.out.println("Mary " + wife);
        System.out.println("John " + husband);

        myHouse.setNumberOfBathrooms(2);
        System.out.println("Number of bathrooms are: " + myHouse);

        myHouse= new House(7,7);
        System.out.println("My house reference: " + myHouse);

        System.out.println("Mary " + wife);
        System.out.println("John " + husband);
        wife.setHouse(myHouse);
        System.out.println(wife);
        System.out.println("---------------------------------");

        myHouse=new House(10,10);
        wife.setHouse(myHouse);
        System.out.println("Mary: " + wife);
        System.out.println("John: " + husband);
        wife.setHouse(husband.getHouse());
}
}
