package com.example.javaprojtectest2.week9.tue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InfixToPostfixTest {
    @Test
    public void test1() {
        InfixToPostfix postfixConverter = new InfixToPostfix();
        Assertions.assertThat(postfixConverter.converter("1*2+3*4/2+5")).isEqualTo("12*34*2/+5+");
    }

    @Test
    public void test2() {
        InfixToPostfix postfixConverter = new InfixToPostfix();
        Assertions.assertThat(postfixConverter.converter("5+3*1+(4-9)*3")).isEqualTo("531*+49-3*+");
    }

    @Test
    public void test3() {
        InfixToPostfixLecture postfixConverter = new InfixToPostfixLecture();
        Assertions.assertThat(postfixConverter.converter("1*2+3*4/2+5")).isEqualTo("12*34*2/+5+");
    }

    @Test
    public void test4() {
        InfixToPostfixLecture postfixConverter = new InfixToPostfixLecture();
        Assertions.assertThat(postfixConverter.converter("5+3*1+(4-9)*3")).isEqualTo("531*+49-3*+");
    }

}