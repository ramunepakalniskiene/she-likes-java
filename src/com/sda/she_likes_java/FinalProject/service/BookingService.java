package com.sda.she_likes_java.FinalProject.service;

import com.sda.she_likes_java.FinalProject.configuration.CarRecordConfig;
import com.sda.she_likes_java.FinalProject.entity.*;
import com.sda.she_likes_java.FinalProject.repsitory.BookingRecordRepository;

import java.time.Duration;
import java.time.LocalDate;

public class BookingService {
    private final BookingRecordRepository bookingRecordRepository;

    public BookingService(BookingRecordRepository bookingRecordRepository) {
        this.bookingRecordRepository = bookingRecordRepository;
    }

    public void bookCar(User user,
                        Car carToBook,
                        LocalDate startDate,
                        LocalDate endDate,
                        boolean isPaid,
                        PayingMethod payingMethod) {
        System.out.println("New car Booking");


        //calculate the price for booking

        long bookingFinalPrice = calculateWholePrice(carToBook, startDate, endDate);
        // creat booking record
        BookingRecord bookingRecord = new BookingRecord(null, user, carToBook, startDate, endDate, bookingFinalPrice, isPaid, payingMethod);
    }

    private static long calculateWholePrice(Car carToBook, LocalDate startDate, LocalDate endDate) {
        PriceCategory priceCategory = carToBook.category();
        long pricePerDayInEuroCents = CarRecordConfig.getPricePerDay(priceCategory);
        Duration datesDuration = Duration.between(startDate, endDate);
        long numberOfDays = datesDuration.toDays();
        return pricePerDayInEuroCents * numberOfDays;
    }
}
