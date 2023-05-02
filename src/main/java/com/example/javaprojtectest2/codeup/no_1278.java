package com.example.javaprojtectest2.codeup;

import java.util.Scanner;

public class no_1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println((int) Math.log10(num) + 1);
        int cnt = 0;
        while (0 < num) {
            cnt++;
            num /= 10;
        }
        System.out.println(cnt);

    }
}
