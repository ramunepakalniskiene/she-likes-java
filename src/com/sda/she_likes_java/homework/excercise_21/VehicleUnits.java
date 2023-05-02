package com.sda.she_likes_java.homework.excercise_21;

public class VehicleUnits {
    public static void whichVehicleMethod(Vehicle vehicle) {
        if (vehicle instanceof Airplane) {
            ((Airplane) vehicle).Flying();
            System.out.println("Method is from Airplane");
        } else if (vehicle instanceof Ship) {
            ((Ship) vehicle).Floating();
            System.out.println("Method is from Ship");
        } else {
            System.out.println("It's a submarine's method or other vehicle");
        }
    }
}
