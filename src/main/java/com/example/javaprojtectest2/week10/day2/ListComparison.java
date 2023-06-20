package com.example.javaprojtectest2.week10.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new LinkedList<>();

        System.out.println();
        rearInsert(arrayList);
        frontInsert(arrayList);
        getElements(arrayList);
        System.out.println();

        System.out.println();
        rearInsert(linkedList);
        frontInsert(linkedList);
        getElements(linkedList);
        System.out.println();
    }

    public static void rearInsert(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list.add("world");
        }

        long end = System.nanoTime();
        System.out.println(String.format("%s 꼬리 삽입 소요시간 %15d ns", list.getClass(), end - start));
    }

    public static void frontInsert(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            list.add(0, "hello");
        }

        long end = System.nanoTime();
        System.out.println(String.format("%s 머리 삽입 소요시간 %15d ns", list.getClass(), end - start));

    }

    public static void getElements(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
//
//        for (Object o : list) {
//            System.out.println(o);
//        }
        long end = System.nanoTime();
        System.out.printf("%s 순차 조회 소요시간 %15d ns%n", list.getClass(), end - start);
    }
}
