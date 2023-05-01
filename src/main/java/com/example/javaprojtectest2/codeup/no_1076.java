package com.example.javaprojtectest2.codeup;

import java.util.Scanner;

public class no_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cInput = sc.next().charAt(0);
        for (char c = 'a'; c <= cInput; c++) {
            System.out.print(c+" ");
        }
    }
}
