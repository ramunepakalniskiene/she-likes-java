package com.sda.she_likes_java.FinalProject.service;

import com.sda.she_likes_java.FinalProject.repsitory.BookingRecordRepository;

public class BookingService {
    private final BookingRecordRepository bookingRecordRepository;

    public BookingService(BookingRecordRepository bookingRecordRepository) {
        this.bookingRecordRepository = bookingRecordRepository;
    }
}
