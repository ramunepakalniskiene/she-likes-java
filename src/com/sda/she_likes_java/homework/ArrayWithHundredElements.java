package com.sda.she_likes_java.homework;

public class ArrayWithHundredElements {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = 3 * i;
            System.out.println("number["+ i +"]=" + array[i]);
        }
        for (int i = array.length - 1; i > -1; i--) {
            System.out.println("number[" + i + "] = " + array[i]);

        }
    }
}
