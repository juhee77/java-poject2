package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1620 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long num = Long.parseLong(br.readLine());
        while (10 <= num) {
            num = eachSum(num);
        }
        System.out.println(num);
    }

    private static long eachSum(long num) {
        long sum = 0;
        while (0 < num) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
