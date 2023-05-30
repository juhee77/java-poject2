package com.example.javaprojtectest2.week7.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearCheckerTest {

    @Test
    public void checkLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Assertions.assertTrue(leapYearChecker.isLeapYear(2020));
        Assertions.assertFalse(leapYearChecker.isLeapYear(1700));
        Assertions.assertTrue(leapYearChecker.isLeapYear(2016));
    }
}