package com.example.javaprojtectest2.week5.day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.javaprojtectest2.week5.day2.interfaceEx.InsertionSortInterface;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    @DisplayName("삽입 정렬 오름차순")
    public void testBubble() {
        Integer[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        InsertionSortInterface selectionSort = new InsertionSortInterface();
        selectionSort.sort(inputs);
        assertArrayEquals(new Integer[]{2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342},inputs);
    }
}