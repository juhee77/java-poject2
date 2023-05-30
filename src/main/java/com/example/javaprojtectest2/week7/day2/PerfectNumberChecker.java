package com.example.javaprojtectest2.week7.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerfectNumberChecker implements Checker{

    @Override
    public boolean is(int num) {
        int sum = getDivisor(num).stream().mapToInt(Integer::intValue).sum();
        return sum == num * 2;
    }

    public List<Integer> getDivisor(int num) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i*i < num ; i++) {
            if (num % i == 0) {
                divisor.add(i);
                divisor.add(num/i);

            }
        }
        if(Math.sqrt(num)%1==0) divisor.add((int) Math.sqrt(num));

        Collections.sort(divisor);
        System.out.println("divisor = " + divisor);
        return divisor;
    }

}
