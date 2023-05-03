package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long start = Long.parseLong(st.nextToken());
        int mul = Integer.parseInt(st.nextToken());
        int add = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        for (int i = 1; i < goal; i++) {
            start = start * mul + add;
        }
        System.out.println(start);
    }
}
