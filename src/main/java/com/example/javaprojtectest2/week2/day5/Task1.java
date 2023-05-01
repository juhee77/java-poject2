package com.example.javaprojtectest2.week2.day5;

import java.util.Scanner;

public class Task1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        checkIfMove();
        checkTrue();
        checkElse();
        checkAccount();
        EvenOrOdd();
        scoreEdge(65);
        scoreGrade(75);
        checkRange(5, 10);
        promotionStatus(2, 18);
    }

    private static void promotionStatus(int year, int projectCount) {
        if (year > 5 || projectCount > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }

    private static void checkRange(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("x와 y는 모두 양수입니다.");
        }
        if (x > 0 || y > 0) {
            System.out.println("x와 y 중 적어도 하나는 양수입니다.");
        }
        if (!(x > 0)) {
            System.out.println("x는 음수 또는 0입니다.");
        }
    }

    private static int getScore() {
        System.out.printf("점수를 입력하세요 : ");
        return sc.nextInt();
    }

    private static void scoreGrade(int score) {
        if (score >= 90) {
            System.out.println("A");
        }
        if (score >= 80) {
            System.out.println("B");
        }
        if (score >= 70) {
        }
    }

    private static void scoreEdge(int score) {
        if (score >= 90) {
            System.out.println("A");
        } else {
            if (score >= 80) {
                System.out.println("B");
            } else {
                if (score >= 70) {
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            }
        }
    }

    private static void EvenOrOdd() {
        int num = 1;
        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    private static void checkAccount() {
        int account = 1400;
        if (account >= 1500) {
            System.out.println("잔액을 차감합니다.");
        } else {
            System.out.println("'잔액이 부족합니다.'를 재생합니다.");
        }
    }

    private static void checkElse() {
        boolean checkTrue = true;
        if (checkTrue) { // 논리값이 true인 경우
            System.out.println("true입니다.");
        } else {
            System.out.println("false입니다.");
        }

        boolean checkFalse = false;
        if (checkFalse) { // 논리값이 false인 경우
            System.out.println("true입니다.");
        } else {
            System.out.println("false입니다.");
        }
    }

    private static void checkTrue() {
        int age = 20;
        if (age > 18) {
            System.out.println("성인 입니다.");
        } else {
            System.out.println("성인이 아닙니다");
        }


    }

    private static void checkIfMove() {
        if (true) {
            System.out.println("true = " + true);
        }

        if (false) {
            System.out.println("false = " + false);
        }
    }
}
