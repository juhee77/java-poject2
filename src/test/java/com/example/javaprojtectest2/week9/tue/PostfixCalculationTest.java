package com.example.javaprojtectest2.week9.tue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PostfixCalculationTest {

    @Test
    public void test1(){
        PostfixCalculation postfixCalculation = new PostfixCalculation();
        Assertions.assertThat(postfixCalculation.solution("12+")).isEqualTo(3);
    }
    @Test
    public void test2(){
        PostfixCalculation postfixCalculation = new PostfixCalculation();
        Assertions.assertThat(postfixCalculation.solution("531*+49-3*+")).isEqualTo(-7);
    }
}