package com.example.javaprojtectest2.printPractice;

import com.example.javaprojtectest2.test.PrintHello;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class PrintMulti {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        multiplication_table();
        System.out.println();
        printDate();

        printAverageScore(3);

        printValCreateAndInit();
    }

    private static void printValCreateAndInit() {
        int iVal;
        iVal = 0;

        PrintHello printHello;
        printHello = new PrintHello();

        printHello.print();
        System.out.println("iVal = " + iVal);

    }

    private static void printAverageScore(int cnt) {
        System.out.println("PrintMulti.printAverageScore");

        double sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += Integer.parseInt(sc.next());
        }
        System.out.printf("평균 점수는 : %.3f입니다.\n", sum / cnt);
    }

    private static void printDate() {
        System.out.println("PrintMulti.printDate");

        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println(now.format(formatter));

        System.out.printf("%04d년 %02d월 %02d일\n\n", now.getYear(), now.getMonth().getValue(), now.getDayOfMonth());
    }

    private static void multiplication_table() {
        System.out.println("PrintMulti.multiplication_table");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("******%d****** ", i);
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d * %2d = %3d ", j, i, j * i);
            }
            System.out.println();
        }
    }

}
