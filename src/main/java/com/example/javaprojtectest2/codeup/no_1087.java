package com.example.javaprojtectest2.codeup;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
            if (num<=sum)break;
        }
        System.out.println(sum);
    }
}
