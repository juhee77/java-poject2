package com.example.javaprojtectest2.week3.day1;

import java.time.LocalDateTime;

public class Task1 {
    private static final String[] day = {"일", "월", "화", "수", "목", "금", "토"};
    public static void main(String[] args) {
        Task1 task = new Task1();
        task.enhancedSwitchSeason(LocalDateTime.now().getMonthValue());
        task.enhancedSwitchDayOfMonth(LocalDateTime.now().getMonthValue());
        task.enhancedSwitchClinicHours(day[LocalDateTime.now().getDayOfWeek().getValue()]);
        task.exForExpression();

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
    }
}
