package com.example.javaprojtectest2.week9.mon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Bar2TestTest {
    @Test
    public void test(){
        Bar2Test barTest = new Bar2Test();
        assertThat(barTest.isRightBar("[{()}()]")).isTrue();
        assertThat(barTest.isRightBar("[{((){}[])}]{}()")).isFalse();
    }

}