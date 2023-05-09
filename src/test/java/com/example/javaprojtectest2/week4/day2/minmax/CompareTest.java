package com.example.javaprojtectest2.week4.day2.minmax;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareTest {

    @Test
    @DisplayName("최대 최소 비교 추상화")
    void compareTest() {
        Max max = new Max();
        Assertions.assertEquals(max.get(5, 3),5) ;

        Min min = new Min();
        Assertions.assertEquals(min.get(5, 3), 3);
    }

}