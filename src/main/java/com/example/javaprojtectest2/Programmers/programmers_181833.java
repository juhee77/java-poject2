package com.example.javaprojtectest2.Programmers;

public class programmers_181833 {
    public int[][] solution(int n) {
        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            map[i][i] = 1;
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(new programmers_181833().solution(2));
    }
}
