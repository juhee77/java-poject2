package com.example.javaprojtectest2.Programmers;

public class programmers_181924 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] nowQuery : queries) {
            int temp = arr[nowQuery[0]];
            arr[nowQuery[0]] = arr[nowQuery[1]];
            arr[nowQuery[1]] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
    }
}
