package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                sb.append("X");
            }else{
                sb.append(i);
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
