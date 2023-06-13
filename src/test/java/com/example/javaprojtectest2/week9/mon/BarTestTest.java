package com.example.javaprojtectest2.week9.mon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BarTestTest {
    @Test
    public void test() {
        BarTest barTest = new BarTest();
        assertThat(barTest.isRightBar("({{()(){}{}{}}})")).isTrue();
        assertThat(barTest.isRightBar("[{((){}[])}]{}()")).isTrue();
        assertThat(barTest.isRightBar("{{()(){}{}{}}})")).isFalse();
    }
}