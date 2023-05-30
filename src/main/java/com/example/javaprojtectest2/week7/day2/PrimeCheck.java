package com.example.javaprojtectest2.week7.day2;

public class PrimeCheck implements Checker {
    @Override
    public boolean is(int num) {
        for (int i = 2; i * i <= num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }
}
