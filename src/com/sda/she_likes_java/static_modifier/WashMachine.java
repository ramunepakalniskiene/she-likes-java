package com.sda.she_likes_java.static_modifier;

public class WashMachine {
    private String brand;
    private String model;

    private static int serialNumber;

    private static int numberOfCreatedMachines;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;
        serialNumber++;

    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNumberOfCreatedMachines() {
        return numberOfCreatedMachines;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static void setNumberOfCreatedMachines(int numberOfCreatedMachines) {
        WashMachine.numberOfCreatedMachines = numberOfCreatedMachines;
    }

    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
