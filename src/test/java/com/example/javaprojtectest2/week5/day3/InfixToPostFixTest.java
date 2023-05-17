package com.example.javaprojtectest2.week5.day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InfixToPostFixTest {
    @Test
    @DisplayName("중위 순회를 후위 순회로 변경1")
    void infixTest1() {
        String postFix = new Infix().toPostFix("A * B - C / ( D + E )");
        Assertions.assertEquals("AB*CDE+/-", postFix);
    }

    @Test
    @DisplayName("중위 순회를 후위 순회로 변경2")
    void infixTest2() {
        String postFix = new Infix().toPostFix("A + B");
        Assertions.assertEquals("AB+", postFix);
    }
}