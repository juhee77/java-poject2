package com.example.javaprojtectest2.week2.day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        arraySum();
        compoundSubstitutionOperator();
        IncreasingAndDecreasingOperators();
        compare();
    }

    private static void compare() {
        boolean isStudent = true;
        int age = 30;
        System.out.println(isStudent && (age >= 20));
    }

    private static void IncreasingAndDecreasingOperators() {
        int i = 0;
        System.out.println(i++);
        System.out.println(++i);
        i = 0;
        System.out.println(i--);
        System.out.println(--i);

    }

    private static void compoundSubstitutionOperator() {
        int x = 5;
        System.out.println("x = " + x);
        x += 5;
        System.out.println("x = " + x);

    }

    private static void arraySum() {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.stream(arr).sum());
    }

}
