package com.example.javaprojtectest2.week3.day1;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    private static final String[] day = {"일", "월", "화", "수", "목", "금", "토"};

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.enhancedSwitchSeason(LocalDateTime.now().getMonthValue());
        task.enhancedSwitchDayOfMonth(LocalDateTime.now().getMonthValue());
        task.enhancedSwitchClinicHours(day[LocalDateTime.now().getDayOfWeek().getValue()]);
        task.exForExpression();
        task.findEven(10);
        task.findOdd(10);
        task.loopChar();
        task.loopUniCode();
        task.gugu_specifiedDan(new int[]{2,4,6,8});
        task.gugu(2);
        task.sum(10);
    }

    private void sum(int range) {
        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += range;
        }
        System.out.println(sum);
    }

    private void gugu(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }

    private void gugu_specifiedDan(int[] dan) {
        for (int nowDan : dan) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", nowDan, i, nowDan * i);
            }
        }
    }

    private void loopUniCode() {
        for (char c = '가'; c <= '힣'; c += 200) {
            System.out.printf("%c ", c);
        }
        System.out.println();

    }

    private void loopChar() {
        for (int c = 65; c <= 'Z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
        System.out.println();
        for (int c = 'A'; c <= 'Z'; c++) {
            System.out.printf("%d ", c);
        }
        System.out.println();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%c ", c);
        }
        System.out.println();
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c+" ");
        }
        System.out.println();
    }


    private void findOdd(int range) {
        System.out.print("홀수 : ");
        for (int i = 0; i <= range; i++) {
            if ((i & 1) == 1) System.out.print(i + " ");
        }
        System.out.println();

    }

    private void findEven(int range) {
        System.out.print("짝수 : ");

        for (int i = 0; i <= range; i++) {
            if ((i & 1) == 0) System.out.print(i + " ");
        }
        System.out.println();
    }


    private void enhancedSwitchSeason(int month) {
        System.out.print("오늘은 " + month + "월 : ");
        switch (month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            default -> System.out.println("해당하는 계절이 없습니다");
        }
    }

    private void enhancedSwitchDayOfMonth(int month) {
        System.out.print("오늘은 " + month + "월 : ");
        int lastDate = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("잘못된 월:" +
                    month);
        };
        System.out.println(lastDate);
    }

    private void enhancedSwitchClinicHours(String day) {
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30-18:30";
            case "토" -> "09:30-13:00";
            case "수", "일" -> "휴진";
            default -> null;
        };
        System.out.printf("%s요일은 %s입니다.", day, time);
    }

    private void exForExpression() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("  ");
            }
            System.out.println(i);
        }


        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; 0 <= i; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        Collections.reverse(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
