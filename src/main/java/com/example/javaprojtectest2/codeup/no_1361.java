package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= 2; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
