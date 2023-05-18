package com.sda.she_likes_java.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        int[] numbers2 = {1, 2, 5, 4, -1};
        Object arrayObject = numbers2;
        System.out.println(numbers2.length);
//        Arrays - contains useful methods for arrays
//        Collections - contains useful methods for collections
        System.out.println("Array before sorting " + Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println(numbers2);
        System.out.println("Array after sorting " + Arrays.toString(numbers2));
    }
}
