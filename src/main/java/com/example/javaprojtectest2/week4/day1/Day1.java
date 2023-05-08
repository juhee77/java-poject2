package com.example.javaprojtectest2.week4.day1;

public class Day1 {
    public static void main(String[] args) {
        Day1 task = new Day1();
        task.printTriangle(5);
        task.printReverseTriangle(5);
        task.pyramid(5);
        task.printReversePyramid(5);
        task.printDiamond(5);
        task.printParallelogram(5);
    }

    private void printParallelogram(int n) {
        //평행 사변형
        System.out.println("평행사변형");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < 4; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printDiamond(int n) {
        if (n % 2 == 0) return;//n은 홀수라 가정한다.
        System.out.println("다이아 몬드");
        //높이가 m인
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < (n / 2 + 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n / 2 - 1; 0 <= i; i--) {
            for (int j = 0; j < (n / 2 + 1) - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printReversePyramid(int num) {
        System.out.println("역방향 피라미드");
        for (int i = num; 0 < i; i--) {
            for (int j = num - i; 0 < j; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printTriangle(int num) {
        System.out.println("직각삼각형");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void printReverseTriangle(int num) {
        System.out.println("역방향 직각삼각형");
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; 0 < j; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void pyramid(int num) {
        System.out.println("피라미드");
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; 0 < j; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
