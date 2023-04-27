package com.example.javaprojtectest2.week2.day4;

public class Task3 {
    public static void main(String[] args) {
        orExample();
        notExample();

    }

    private static void notExample() {
        System.out.println();
        boolean result = !true;
        System.out.printf("%b\n", result);
        result = !false;
        System.out.printf("%b\n", result);
    }

    private static void orExample() {
        int yearsOfExp = 8;
        int numOfProj = 12;
        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;

        System.out.printf("팀장 승진 여부: %b", isPromotion);
    }

}
