package com.sda.she_likes_java.sorting;

import java.util.Objects;

public class House implements Comparable<House> {
    private int numberOfRooms;
    private int NumberOfFloors;
    private int numberOfBathrooms;
    private String address;

    public House(int numberOfRooms, int numberOfFloors, int numberOfBathrooms, String address) {
        this.numberOfRooms = numberOfRooms;
        NumberOfFloors = numberOfFloors;
        this.numberOfBathrooms = numberOfBathrooms;
        this.address = address;
    }

    @Override
    public int compareTo(House o) {
        return numberOfBathrooms - o.numberOfBathrooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfFloors() {
        return NumberOfFloors;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", NumberOfFloors=" + NumberOfFloors +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return getNumberOfRooms() == house.getNumberOfRooms() && getNumberOfFloors() == house.getNumberOfFloors() && getNumberOfBathrooms() == house.getNumberOfBathrooms() && Objects.equals(getAddress(), house.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfRooms(), getNumberOfFloors(), getNumberOfBathrooms(), getAddress());
    }
}
