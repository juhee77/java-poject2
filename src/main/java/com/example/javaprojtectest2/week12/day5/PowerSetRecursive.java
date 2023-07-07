package com.example.javaprojtectest2.week12.day5;

import java.util.Arrays;

public class PowerSetRecursive {
    public static void main(String[] args) {
        int[] set = new int[]{2, 3, 5};
        // 선택 여부를 저장하는 배열
        new PowerSetRecursive().powerSet(set, 0, new int[set.length]);
        System.out.println();
        new PowerSetRecursive().powerSet2(set, 0, new boolean[set.length]);
    }

    private void powerSet2(int[] set, int next, boolean[] visited) {
        if (next == set.length) {
            for (int i = 0; i < set.length; i++) {
                if (visited[i]) System.out.print(set[i] + ", ");
            }
            System.out.println();
        }
        else {
            visited[next] = true;
            powerSet2(set, next + 1, visited);

            visited[next] = false;
            powerSet2(set, next + 1,visited);
        }
    }

    public void powerSet(int[] set, int next, int[] select) {
        if (next == set.length) {
            for (int i = 0; i < set.length; i++) {
                if (select[i] == 1) System.out.print(set[i] + ", ");
            }
            System.out.println(Arrays.toString(select));
        }
        else {
            powerSet(set, next + 1, select);
            select[next] = 1;
            powerSet(set, next + 1, select);
            select[next] = 0;
        }
    }
}