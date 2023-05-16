package week5.day2;

import org.junit.jupiter.api.Test;
import week5.day2.abstractEx.InsertionSortAbstract;
import week5.day2.abstractEx.SelectionSortAbstract;
import week5.day2.abstractEx.SortAbstract;
import week5.day2.interfaceEx.InsertionSortInterface;
import week5.day2.interfaceEx.SelectionSortInterface;
import week5.day2.interfaceEx.SortInterface;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TotalTest {
    @Test
    public void testInterface() {
        Integer[] inputs1 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        Integer[] inputs2 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        Integer[] expected1 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};

        //실행 전
        SortInterface selectionSort = new SelectionSortInterface();
        SortInterface insertionSort = new InsertionSortInterface();
        assertArrayEquals(expected1, inputs1);
        assertArrayEquals(expected1, inputs2);

        //실행
        selectionSort.sort(inputs1);
        insertionSort.sort(inputs2);

        //실행 후
        Integer[] expected2 = {2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342};
        assertArrayEquals(expected2, inputs1);
        assertArrayEquals(expected2, inputs2);
    }

    @Test
    public void testAbstract() {
        Integer[] inputs1 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        Integer[] inputs2 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};
        Integer[] expected1 = {2, 5, 2, 57, 34, 12, 65, 226, 47, 34, 6, 5, 342, 123};

        //실행 전
        SortAbstract selectionSort = new SelectionSortAbstract();
        SortAbstract insertionSort = new InsertionSortAbstract();
        assertArrayEquals(expected1, inputs1);
        assertArrayEquals(expected1, inputs2);

        //실행
        selectionSort.sort(inputs1);
        insertionSort.sort(inputs2);

        //실행 후
        Integer[] expected2 = {2, 2, 5, 5, 6, 12, 34, 34, 47, 57, 65, 123, 226, 342};
        assertArrayEquals(expected2, inputs1);
        assertArrayEquals(expected2, inputs2);


    }
}
