package com.sda.she_likes_java.FinalProject.configuration;

import com.sda.she_likes_java.FinalProject.entity.PriceCategory;

import java.util.HashMap;
import java.util.Map;

public class CarRecordConfig {
    private final static Map<PriceCategory, Long> categoryPricePerDay = new HashMap<>();

    public static long getPricePerDay(PriceCategory category) {
        return categoryPricePerDay.get(category);
    }

    // execute this static block just once during class loading
    static {
        //populate our map
        categoryPricePerDay.put(PriceCategory.LIMOUSIN, 100_000L);
        categoryPricePerDay.put(PriceCategory.LUXURY, 90_000L);
        categoryPricePerDay.put(PriceCategory.ECONOMICAL, 50_000L);
        categoryPricePerDay.put(PriceCategory.COMFORT, 85_000L);
    }
}
