package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 1;
        for (int i = 0; i < 4; i++) {
            sum *= Integer.parseInt(st.nextToken());
        }
        System.out.printf("%.1f MB", (double) sum / (1024 * 1024 * 8));
    }
}
