package com.example.javaprojtectest2.week5.day4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task1Test {
    public static final String TINPUT1 = "()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()";
    public static final String FINPUT1 = "(()())(()))))))()()())))()()()())()()())(()())(()))))))()()())))()()()())()()())(()())(()))))))()()())))()()()())()()())(()())(()))))))()()())))()()()())()()())(()())(()))))))()()())))()()()())()()())";
    public static final String TINPUT2 = "(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((())))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))";
    Task1 ts1 = new Task1();
    @Test
    @DisplayName("STACK")
    void checkPairWithStack() {
        TimeCheck tc = new TimeCheck();

        assertTrue(ts1.checkPairWithStack(TINPUT1));
        assertFalse(ts1.checkPairWithStack(FINPUT1));
        assertTrue(ts1.checkPairWithStack(TINPUT2));

        System.out.println("시간차이 : " + tc.finish());
        //beforeTime = 1684398658927
        //afterTime = 1684398658927
        //시간차이 : 0

    }

    @Test
    @DisplayName("SPLIT")
    void checkPairWithSplit() {
        TimeCheck tc = new TimeCheck();

        assertTrue(ts1.checkPairWithSplit(TINPUT1));
        assertFalse(ts1.checkPairWithSplit(FINPUT1));
        assertTrue(ts1.checkPairWithSplit(TINPUT2));

        System.out.println("시간차이 : " + tc.finish());
        //beforeTime = 1684398658903
        //afterTime = 1684398658908
        //시간차이 : 5
    }

    @Test
    @DisplayName("REPLACE")
    void checkPairWithReplace() {
        TimeCheck tc = new TimeCheck();

        assertTrue(ts1.checkPairWithReplace(TINPUT1));
        assertFalse(ts1.checkPairWithReplace(FINPUT1));
        assertTrue(ts1.checkPairWithReplace(TINPUT2));

        System.out.println("시간차이 : " + tc.finish());
        //beforeTime = 1684398658919
        //afterTime = 1684398658922
        //시간차이 : 3
    }
}