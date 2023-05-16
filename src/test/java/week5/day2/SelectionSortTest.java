package week5.day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    @DisplayName("선택 정렬 오름차순")
    public void testBubble() {
        int[] inputs = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        SelectionSort selectionSort = new SelectionSort();

        assertArrayEquals(selectionSort.sort(inputs), new int[]{2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342});
    }

}