package com.sda.she_likes_java.homework.excercise_21;

public class Main {
    public static void main(String[] args) {


        Vehicle airplaneVehicle = new Airplane();
        Vehicle shipVehicle = new Ship();
        Vehicle submarineVehicle = new Submarine();

        System.out.println("Methods seen from vehicle class: ");
        airplaneVehicle.move();
        shipVehicle.move();
        submarineVehicle.move();

        System.out.println("===========");

        System.out.println("Methods seen from Airplane/Ship/Submarine classes: ");
        Airplane airplaneAirplane = new Airplane();
        airplaneAirplane.move();
        airplaneAirplane.Flying();
        Ship shipShip = new Ship();
        shipShip.move();
        shipShip.Floating();
        Submarine submarineSubmarine = new Submarine();
        submarineSubmarine.move();
        submarineSubmarine.Diving();
        System.out.println("=============");

        System.out.println("Methods seen from interface perspective: ");

        Floating shipFloating = new Ship();
        shipFloating.Floating();
        Flying airplaneFlying = new Airplane();
        airplaneFlying.Flying();
        Diving submarineDiving = new Submarine();
        submarineDiving.Diving();

        System.out.println("Casting:");

        //casting
        VehicleUnits.whichVehicleMethod(airplaneAirplane);
        VehicleUnits.whichVehicleMethod(airplaneVehicle);
        // VehicleUnits.whichVehicleMethod(airplaneFlying); casting from interface not possible since VehicleUnits requires Vehicle type
        System.out.println("-----------------");
        VehicleUnits.whichVehicleMethod(shipShip);
        VehicleUnits.whichVehicleMethod(shipVehicle);
        System.out.println("-----------------");
        VehicleUnits.whichVehicleMethod(submarineSubmarine);
        VehicleUnits.whichVehicleMethod(submarineVehicle);


    }
}
