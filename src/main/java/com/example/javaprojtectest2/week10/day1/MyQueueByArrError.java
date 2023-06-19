package com.example.javaprojtectest2.week10.day1;

public class MyQueueByArrError {

    private int front = 0;
    public int rear = 0;
    private final int[] arr;

    public MyQueueByArrError() {
        arr = new int[10];
    }

    public MyQueueByArrError(int capacity) {
        arr = new int[capacity];
    }

    public void enqueue(int num) {
        if (rear == arr.length) {
            throw new RuntimeException("용량이 초과 되었습니다.");
        }
        arr[rear++] = num;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front++];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[rear];
    }

    public int capacity() {
        return arr.length;
    }

    public int size() {
        return rear - front;
    }

    public boolean isEmpty() {
        return front == rear;
    }
}
