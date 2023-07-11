package com.example.javaprojtectest2.week13.day2;

public class BinarySearch {
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                //탐색 성공
                return mid;
            } else if (arr[mid] < target) {
                //오른쪽을 탐색
                left = mid+1;
            } else {
                //왼쪽을 탐색
                right = mid - 1;
            }
        }

        return -1;//배열 내에 원하는 숫자가 없다.
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int index = new BinarySearch().binarySearch(arr, target);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("탐색 실패");
        }
    }
}
