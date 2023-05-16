package week5.day2;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    //현재 정렬할 값을 있어야 할 위치로 점점 당겨온다.
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    //앞에 정렬이 되어있는 경우이므로 건너간다.
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
