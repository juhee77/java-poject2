package com.example.javaprojtectest2.week4.day2.minmax;

public class Min extends Compare {
    @Override
    boolean compareTo(int a, int b) {
        return (a > b) ? false : true;
    }
}
