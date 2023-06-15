package com.example.javaprojtectest2.week9.thu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFPatternMatching {
    public int findPattern(String target, String pattern) {
        int tarIdx = 0;
        int patIdx = 0;

        while (tarIdx < target.length()) {
            if (target.charAt(tarIdx++) != pattern.charAt(patIdx++)) {
                tarIdx = tarIdx - patIdx + 1;
                patIdx = 0;
            }

            if (patIdx == pattern.length()) {
                return tarIdx - patIdx;
            }
        }
        System.out.println("404 Not Found");
        return -1;

    }


    // qwertyuiuiuytrertyuiopopoiuytrqwertyuytrertywqwertyuiuytrewqwertyuiiuiuiytrewert
    // qwert
    public static void main(String[] args) throws IOException {

        BFPatternMatching bfPatternMatching = new BFPatternMatching();
        System.out.println(bfPatternMatching.findPattern("qwertyuiuiuytrertyuiopopoiuytrqwertyuytrertywqwertyuiuytrewqwertyuiiuiuiytrewert", "qwert"));
        System.out.println(bfPatternMatching.findPattern("][poiuytrewqqwer", "qwert"));
        System.out.println(bfPatternMatching.findPattern("][poiuytrewqqwert", "qwert"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bfPatternMatching.findPattern(reader.readLine(), reader.readLine()));

    }
}