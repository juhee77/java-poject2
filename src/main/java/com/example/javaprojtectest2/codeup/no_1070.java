package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1070 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        findSeason(sc.nextInt());
    }

    private static void findSeason(int month) {
        switch (month) {
            case 12, 1, 2:
                System.out.println("winter");
                break;
            case 3, 4, 5:
                System.out.println("spring");
                break;
            case 6, 7, 8:
                System.out.println("summer");
                break;
            case 9, 10, 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다");
        }
    }
}
