package com.example.javaprojtectest2.Programmers;

public class programmers_181922 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (i % query[2] == 0) arr[i]++;
            }
        }
        return arr;
    }

}
