package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= num * i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
