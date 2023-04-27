package com.example.javaprojtectest2.week2.day4;

public class Task1 {
    public static void main(String[] args) {
        fintTime();
        sumEachDigit();
        increaseAndDecreaseHeart();
        depositMoney();
    }

    private static void depositMoney() {
        int deposit = 0;
        deposit += 5000;
        System.out.println("deposit = " + deposit);
        deposit -= 5000;
        System.out.println("deposit = " + deposit);
    }

    private static void increaseAndDecreaseHeart() {
        int likeCnt = 0;
        likeCnt += 1;
        System.out.println("likeCnt = " + likeCnt);
        likeCnt -= 1;
        System.out.println("likeCnt = " + likeCnt);
    }

    private static void sumEachDigit() {
        int num = 687;
        int sum = 0;
        while (1 <= num) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

    private static void fintTime() {
        int seconds = 239;
        int minute = seconds / 60; // 분
        int remainSeconds = seconds % 60; // 초
        System.out.printf("%d분 %d초\n", minute, remainSeconds);
    }
}
