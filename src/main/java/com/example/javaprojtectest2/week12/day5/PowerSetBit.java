package com.example.javaprojtectest2.week12.day5;

import java.util.Arrays;

public class PowerSetBit {
    public static void main(String[] args) {
        int[] set = new int[]{2, 3, 5};
        // 선택 여부를 저장하는 배열
        new PowerSetBit().powerSet(set);
    }

    private void powerSet(int[] set) {
        int subSetCnt = (1 << set.length);

        System.out.println(Arrays.toString(set));
        for (int i = 0; i < subSetCnt; i++) {
            System.out.println(Integer.toBinaryString(i)+" ans:");
            for (int j = 0; j < set.length; j++) {
                if ((i & 1 << j) == 1<<j) System.out.print(set[j]+" "); //현재 자릿수에 둘다 1 인지
                // 101 | 100 = 100(현재 1번째 자리에 대해서 둘다 일치하면 현재 값보다 크다)
                // 011 | 100 == 000 (0이다)
                // 왜냐하면 1<<j이기 때문에 0이거나 1<<j 이거나 둘중 하나이다.
            }
            System.out.println();

        }

    }

}