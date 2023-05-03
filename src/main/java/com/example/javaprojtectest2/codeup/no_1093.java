package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        int num1And2Lcm = num1 * num2 / gcd(num1, num2);
        int totalLcm = num3 * num1And2Lcm / gcd(num3, num1And2Lcm);
        System.out.println(totalLcm);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }
}
