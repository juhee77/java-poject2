package com.example.javaprojtectest2.week10.day1;

public class MyQueueByArr {

    public int rear = 0;
    private final int[] arr;

    public MyQueueByArr() {
        arr = new int[10];
    }

    public MyQueueByArr(int capacity) {
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


        int ans = arr[0];
        System.arraycopy(arr, 1, arr, 0, rear--);
        arr[rear] = 0;
        return ans;
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
        return rear;
    }

    public boolean isEmpty() {
        return rear == 0;
    }
}
