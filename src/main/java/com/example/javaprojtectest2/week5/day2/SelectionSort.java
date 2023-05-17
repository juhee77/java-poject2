package com.example.javaprojtectest2.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // 배열에서 최솟값의 인덱스를 찾는다
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 최솟값과 현재 요소를 교환한다. (swap)
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
