package com.example.javaprojtectest2.week5.day3;

public class Mystack {
    int[] arr;
    int pointer = 0;

    public Mystack() {
        arr = new int[100];
    }

    public Mystack(int size) {
        arr = new int[size];
    }

    public void push(int value) {
        checkCanPush();
        arr[pointer++] = value;
        System.out.println(pointer);
    }

    public int pop() {
        checkCanPop();
        return this.arr[pointer--];
    }

    private void checkCanPop() {
        if (isEmpty())
            throw new RuntimeException("스택이 비었습니다.");
    }

    private void checkCanPush() {
        if (pointer==capacity())
            throw new RuntimeException("스택이 가득 찼습니다.");
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public int peek() {
        checkCanPop();
        return this.arr[pointer - 1];
    }

    public int capacity() {
        return arr.length;
    }

    public int size() {
        return pointer;
    }
}
