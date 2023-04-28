package com.example.javaprojtectest2.codeup;

import java.util.Scanner;

public class no_1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] num = input.replaceAll("[C,H]", " ").trim().split(" ");
        System.out.println(Integer.parseInt(num[0]) * 12 + Integer.parseInt(num[1]));
    }
}
