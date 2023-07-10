package com.example.javaprojtectest2.week13.day1;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        new MergeSort().sort(new int[]{5, 4, 3, 2, 1});
    }

    public void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSort(arr, 0, arr.length-1);
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) >> 1;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, mid, left, right);

        }
    }

    private static void merge(int[] arr, int mid, int left, int right) {
        //머지한다.
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right+1);

        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int leftIndex = 0;
        int rightIndex = 0;
        int nowIndex = left;
        while (leftIndex < leftSize && rightIndex < rightSize) {
            //왼쪽 배열의 값이 더 작거나 같은경우
            if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[nowIndex++] = leftArr[leftIndex++];
            } else {
                arr[nowIndex++] = rightArr[rightIndex++];
            }
        }

        while (leftIndex < leftSize) {
            arr[nowIndex++] = leftArr[leftIndex++];
        }
        while (rightIndex < rightSize) {
            arr[nowIndex++] = rightArr[rightIndex++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
