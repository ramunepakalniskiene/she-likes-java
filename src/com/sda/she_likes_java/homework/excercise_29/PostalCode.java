package com.sda.she_likes_java.homework.excercise_29;

public class PostalCode {
    private final String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "postalCode='" + postalCode + '\'' +
                '}';
    }

    public void checkPostalCode(String postalCode) throws Exception {
        Boolean postalCodeCheck = false;
        if (postalCodeCheck) {
            return;
        } else {
            System.out.println("Note: Code format is incorrect!");
            throw new Exception("Please enter Postal Code in correct format");
        }
    }
}
