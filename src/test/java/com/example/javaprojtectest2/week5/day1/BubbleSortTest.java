package com.example.javaprojtectest2.week5.day1;

import com.example.javaprojtectest2.week5.day1.BubbleSort;
import com.example.javaprojtectest2.week5.day1.BubbleSort2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {
    @Test
    @DisplayName("오름차순")
    public void testBubble() {
        int[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        BubbleSort bs = new BubbleSort(Comparator.comparingInt(o -> o));
        bs.sortAround(inputs);

        assertArrayEquals(inputs, new int[]{2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342});
    }

    @Test
    @DisplayName("내림차순")
    public void testBubble2() {
        int[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        BubbleSort bs = new BubbleSort((o1, o2) -> o2 - o1);
        bs.sortAround(inputs);

        assertArrayEquals(inputs, new int[]{342, 226, 123, 65, 57, 47, 34, 34, 12, 6, 5, 5, 2, 2});
    }

    @Test
    @DisplayName("오름차순2")
    public void testBubble2_1() {
        int[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        BubbleSort2 bs = new BubbleSort2(Comparator.comparingInt(o -> o));
        bs.sortAround(inputs);

        assertArrayEquals(inputs, new int[]{2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342});
    }

    @Test
    @DisplayName("내림차순2")
    public void testBubble2_2() {
        int[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        BubbleSort2 bs = new BubbleSort2((o1, o2) -> o2 - o1);
        bs.sortAround(inputs);

        assertArrayEquals(inputs, new int[]{342, 226, 123, 65, 57, 47, 34, 34, 12, 6, 5, 5, 2, 2});
    }

}