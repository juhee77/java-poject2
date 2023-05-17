package com.example.javaprojtectest2.week5.day2;

import java.util.Arrays;

public class InsertionSortGeneric<T extends Comparable<T>> {
    public T[] sort(T[] arr, boolean isAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((isAscending ? arr[j].compareTo(arr[j - 1]) : arr[j - 1].compareTo(arr[j])) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }
    public T[] sort(T[] arr) {
        return sort(arr, true);
    }
    public static void main(String[] args) {
        Integer[] arr = {7, 2, 3, 9, 28, 11};
        Character[] cArr = {'h', 'e', 'g', 'a', 'c'};
        InsertionSortGeneric<Character> is = new InsertionSortGeneric();
        InsertionSortGeneric<Integer> isInt = new InsertionSortGeneric();
        System.out.println(Arrays.toString(is.sort(cArr, true)));
        System.out.println(Arrays.toString(isInt.sort(arr)));
    }
}
