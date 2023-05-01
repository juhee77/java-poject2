package com.example.javaprojtectest2.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_181921 {
    public int[] solution(int l, int r) {
        List<Integer> all = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (checkZeroAndFive(i)) all.add(i);
        }

        if(all.size()==0) all.add(-1);
        return all.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean checkZeroAndFive(int num) {
        while (1 <= num) {
            int remain = num % 10;
            if (remain != 0 && remain != 5) {
                return false;
            }

            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new programmers_181921().solution(10, 20)));
    }
}
