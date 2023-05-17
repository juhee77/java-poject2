package com.example.javaprojtectest2.week5.day2.interfaceEx;

public interface SortInterface {
    //<T extends Comparable<T>> T[] sort(T[] arr);
    <T extends Comparable<T>> void sort(T[] arr);
}
