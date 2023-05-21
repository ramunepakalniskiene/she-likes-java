package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortingAlgorithm {
    static void bubbleSort(int array[]) {
        int size = array.length;
        // loop over each element of the array to access them
        for (int i = 0; i < size - 1; i++) {
            // compare the elements of the array with a loop
            for (int j = 0; j < size - i - 1; j++) {
                // compare two adjacent elements in the array
                if (array[j] > array[j + 1]) {
                    // Swap if the elements aren't in the right order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}




