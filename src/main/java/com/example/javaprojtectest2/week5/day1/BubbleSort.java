package com.example.javaprojtectest2.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    private final Comparator<Integer> comparator;

    public BubbleSort(Comparator<Integer> comparator) {
        this.comparator = comparator;
    }

    public int[] sortAround(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
