package com.example.javaprojtectest2.week4.day2.minmax;

public abstract class Compare {
    abstract boolean compareTo(int a, int b);

    int get(int a, int b){
        if(compareTo(a,b)) return a;
        return b;
    }

}
