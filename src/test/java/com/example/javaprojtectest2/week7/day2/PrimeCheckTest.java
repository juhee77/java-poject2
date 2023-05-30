package com.example.javaprojtectest2.week7.day2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PrimeCheckTest {

    @Test
    public void checkPrime() {
        Checker checker = new PrimeCheck();
        assertThat(checker.is(3)).isTrue();
        assertThat(checker.is(17)).isTrue();
        assertThat(checker.is(20)).isFalse();
    }
}