package com.example.javaprojtectest2.Programmers;

public class programmers_181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            int min = 10000001;

            for (int i = s; i <= e; i++) {
                if (k < arr[i]) {
                    min = Math.min(min, arr[i]);
                }
            }
            if (min == 10000001) answer[q] = -1;
            else answer[q] = min;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
