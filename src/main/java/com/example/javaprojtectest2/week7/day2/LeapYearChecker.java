package com.example.javaprojtectest2.week7.day2;

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
}
