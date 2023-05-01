package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int goal = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (; cnt <= 1000; cnt++) {
            goal -= cnt;
            if (goal <= 0) break;
        }
        System.out.println(cnt);
    }
}
