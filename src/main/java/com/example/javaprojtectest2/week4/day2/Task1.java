package com.example.javaprojtectest2.week4.day2;

public class Task1 {

    public static final String BLANK = " ";
    public static final String STAR = "*";

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.printDiamond(5);
        task1.printParallelogram(5);
        task1.printReversePyramid(5);

        exStatic();
    }

    private static void exStatic() {
        System.out.println("Static 으로 선언해서 그냥 호출 해도 된다아");
    }

    private void printParallelogram(int n) {
        //평행 사변형
        System.out.println("평행사변형");
        for (int i = 0; i < n; i++) {
            printOneLine((n - i - 1), BLANK);
            printOneLine(4, STAR);
            System.out.println();
        }
        System.out.println();
    }


    private void printDiamond(int n) {
        if (n % 2 == 0) return;//n은 홀수라 가정한다.
        System.out.println("다이아 몬드");
        //높이가 m인
        for (int i = 0; i < n / 2 + 1; i++) {
            printOneLine((n / 2 + 1) - i, BLANK);
            printOneLine(i * 2 + 1, STAR);
            System.out.println();
        }
        for (int i = n / 2 - 1; 0 <= i; i--) {
            printOneLine((n / 2 + 1) - i, BLANK);
            printOneLine(i * 2 + 1, STAR);
            System.out.println();
        }
        System.out.println();
    }

    private void printReversePyramid(int num) {
        System.out.println("역방향 피라미드");
        for (int i = num; 0 < i; i--) {
            printOneLine(num - i, BLANK);
            printOneLine(2 * (i - 1) + 1, STAR);
            System.out.println();
        }
        System.out.println();
    }

    private static void printOneLine(int repeatNum, String str) {
        System.out.print(str.repeat(repeatNum));
    }

}
