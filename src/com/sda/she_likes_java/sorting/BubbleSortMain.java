package com.sda.she_likes_java.sorting;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.sda.she_likes_java.sorting.BubbleSortingAlgorithm.bubbleSort;


public class BubbleSortMain {
    public static void main(String[] args) {

        int[] num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers you want to enter: ");
        int n = 0;
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            scanner.nextLine();
        }
        num = new int[n];
        System.out.print("Enter the integers separated by a space: ");
        String[] strNums = null;
        if (scanner.hasNextLine()) {
            strNums = scanner.nextLine().split(" ");
        }
        if (strNums != null) {
            for (int i = 0; i < n; i++) {
                try {
                    num[i] = Integer.parseInt(strNums[i]);
                } catch (Exception e) {
                    System.out.println("Invalid input");
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(num));

        BubbleSortingAlgorithm.bubbleSort(num);//sorting array elements using bubble sort
        System.out.println(Arrays.toString(num));


    }
}

