package com.example.javaprojtectest2.Programmers;

import java.util.Arrays;

public class SecretMap_17681_2 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);

            char[] tempAns = new char[n];
            Arrays.fill(tempAns, ' ');

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1'){
                    tempAns[(n - str.length()) + j] = '#';
                }
            }
            answer[i] = new String(tempAns);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SecretMap_17681_2().solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }
}
