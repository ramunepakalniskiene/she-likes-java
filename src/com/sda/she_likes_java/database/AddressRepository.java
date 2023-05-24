package com.sda.she_likes_java.database;

import java.util.List;

public class AddressRepository {
    private static final String allAddressesQuery = """
            SELECT ID,CITY,STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            """;
    private static final String findAddressByID = """
            SELECT ID,CITY,STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE ID = %d -- place for id of row
            """;
    private static final String findAddressesByCityAndCountry = """
            SELECT ID,CITY,STREET, POSTAL_CODE, COUNTRY
            FROM ADDRESSES
            WHERE CITY = %S AND COUNTRY = %s
            """;

    public static List<Address> getAllUsers() {
        return List.of();
    }
}
