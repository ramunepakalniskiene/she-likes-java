package com.sda.she_likes_java.FinalProject.entity;

import java.time.YearMonth;

public record Car(
        Long id,
        String brand,
        String model,
        GearboxType gearboxType,
        CarBody carBody,
        FuelType fuelType,
        long mileage,
        YearMonth productionDate,
        PriceCategory category) {

}
