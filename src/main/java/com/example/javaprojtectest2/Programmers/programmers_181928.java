package com.example.javaprojtectest2.Programmers;

public class programmers_181928 {
    public int solution(int[] arr) {
        int odd = 0;
        int even = 0;
        for (int now : arr) {
            if (now % 2 == 0) {
                even = even * 10 + now;
            } else {
                odd = odd * 10 + now;
            }
        }
        return odd + even;
    }

    public static void main(String[] args) {
        System.out.println(new programmers_181928().solution(new int[]{3, 4, 5, 2, 1}));
    }
}
