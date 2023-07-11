package com.example.javaprojtectest2.week13.day2;

public class BinarySearchRecursion {
    public int binarySearch(int[] arr, int target, int left, int right) {
        if (right < left) return -1;

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        } if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right);
        } else {
            return binarySearch(arr, target, 0, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int index = new BinarySearchRecursion().binarySearch(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("탐색 실패");
        }
    }
}
