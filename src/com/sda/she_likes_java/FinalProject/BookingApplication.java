package com.sda.she_likes_java.FinalProject;

import com.sda.she_likes_java.FinalProject.repsitory.BookingRecordRepository;
import com.sda.she_likes_java.FinalProject.service.BookingService;

public class BookingApplication {
    public static void main(String[] args) {
        System.out.println("Booking application started");
        BookingRecordRepository bookingRecordRepository = new BookingRecordRepository();
        BookingService bookingService = new BookingService(bookingRecordRepository);
    }

    public void bookCar() {
        System.out.println("New car booking");
    }
}
