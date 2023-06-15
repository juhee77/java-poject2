package com.example.javaprojtectest2.week9.thu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class IntegerToAlphaTest {
    @Test
    public void test() {
        IntegerToAlpha integerToAlpha = new IntegerToAlpha();
        assertThat(integerToAlpha.itoa(12345)).isEqualTo("12345");
        assertThat(integerToAlpha.itoa(-12345)).isEqualTo("-12345");
    }

}