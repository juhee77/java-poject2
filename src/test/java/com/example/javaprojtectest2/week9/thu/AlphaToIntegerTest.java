package com.example.javaprojtectest2.week9.thu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AlphaToIntegerTest {

    @Test
    public void test() {
        AlphaToInteger alphaToInteger = new AlphaToInteger();
        assertThat(alphaToInteger.atoi("12345")).isEqualTo(12345);
        assertThat(alphaToInteger.atoi("-4561")).isEqualTo(-4561);
    }
}