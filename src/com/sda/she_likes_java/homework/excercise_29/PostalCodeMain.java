package com.sda.she_likes_java.homework.excercise_29;

public class PostalCodeMain {
    public static void main(String[] args) {
        PostalCode myPostalCode = new PostalCode(null);
        try {
            myPostalCode.checkPostalCode(null);
        } catch (Exception e) {
            throw new RuntimeException("Note: " + e);
        }
    }
}
