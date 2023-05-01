package com.example.javaprojtectest2.codeup;

import java.io.IOException;
import java.util.Scanner;

public class no_1081 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int xRange = sc.nextInt();
        int yRange = sc.nextInt();

        for (int i = 1; i <= xRange; i++) {
            for (int j = 1; j <= yRange; j++) {
                sb.append(i).append(" ").append(j).append("\n");
            }
        }
        System.out.println(sb);
    }
}
