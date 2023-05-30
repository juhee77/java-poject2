package com.example.javaprojtectest2.week7.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PerfectNumberCheckerTest {
    @Test
    public void checkPerfect(){
        Checker perfectNumberChecker = new PerfectNumberChecker();
        assertThat(perfectNumberChecker.is(6)).isTrue();
        assertThat(perfectNumberChecker.is(28)).isTrue();
        assertThat(perfectNumberChecker.is(100)).isFalse();
    }


    @Test
    public void checkDivisor(){
        PerfectNumberChecker checker = new PerfectNumberChecker();
        assertThat(checker.getDivisor(30)).isEqualTo(List.of(1, 2, 3, 5, 6, 10, 15, 30));
        assertThat(checker.getDivisor(4)).isEqualTo(List.of(1, 2, 4));
    }
}