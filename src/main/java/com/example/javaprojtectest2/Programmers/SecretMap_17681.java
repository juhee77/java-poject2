package com.example.javaprojtectest2.Programmers;

import java.util.Arrays;

public class SecretMap_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int temp1 = arr1[i], temp2 = arr2[i];
            StringBuilder tempAns = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (temp1 % 2 + temp2 % 2 >= 1) tempAns.insert(0, "#");
                else tempAns.insert(0, " ");
                temp1 /= 2;
                temp2 /= 2;
            }
            answer[i] = tempAns.toString();
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SecretMap_17681().solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }
}
