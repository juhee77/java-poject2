package com.example.javaprojtectest2.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_4596 {
    private static final int SIZE = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = Integer.MIN_VALUE;
        int indexX = -1;
        int indexY = -1;

        for (int i = 1; i <= SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= SIZE; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (max < temp) {
                    max = temp;
                    indexX = i;
                    indexY = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(indexX + " " + indexY);
    }
}
