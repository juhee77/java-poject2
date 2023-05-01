package com.example.javaprojtectest2.week2.day5;

import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws IOException {
        autoSwap(new int[]{3, 4, 2, 1});
        bubbleSor(new int[]{2, 4, 6, 8, 9, 1, -1});
        useSwitchWithBreak(11);
        useSwitchWithNoBreak(11);
        useSwitchWithNoBreakReadEasily(11);
        clinicHours("수");
    }

    private static void clinicHours(String day) {
        String time = null;
        switch (day) {
            case "월", "화", "목", "금":
                time = "09:30-18:30";
                break;
            case "토":
                time = "09:30-13:00";
                break;
            case "수", "일":
                time = "휴진";
                break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }

    private static void useSwitchWithNoBreakReadEasily(int month) {
        switch (month) {
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다");
        }
    }

    private static void useSwitchWithNoBreak(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다");
        }
    }

    private static void useSwitchWithBreak(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println(dayOfWeek + "에 해당하는 요일은 없습니다.");
        }

    }

    private static void autoSwap(int[] arr) {
        swapNum(arr, 0);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapNum(arr, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swapNum(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
}
