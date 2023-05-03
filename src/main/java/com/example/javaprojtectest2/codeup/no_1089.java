package com.example.javaprojtectest2.codeup;

import java.io.*;
import java.util.StringTokenizer;

public class no_1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int diff = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        System.out.println(diff*(goal-1)+start);
    }
}
