package com.sda.she_likes_java.FinalProject.repsitory;

import com.sda.she_likes_java.FinalProject.entity.BookingRecord;
import com.sda.she_likes_java.homework.excercise_17.Book;

import java.util.HashMap;
import java.util.Map;

public class BookingRecordRepository {
    private Map<Long, BookingRecord> recordMap;
    private static long lastId;

    public BookingRecordRepository() {
        recordMap = new HashMap<>();

    }

    public BookingRecord storeBookingRecord(BookingRecord record) {
        long id = nextID();
        record.setBookingId(id);
        recordMap.put(id, record);
        return record;

    }

    private static long nextID() {
        return ++lastId;
    }
}
