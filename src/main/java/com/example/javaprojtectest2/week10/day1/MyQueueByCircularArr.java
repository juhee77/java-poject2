package com.example.javaprojtectest2.week10.day1;

public class MyQueueByCircularArr {

    public int front = 0;
    public int rear = 0;
    private final int[] arr;

    //원형 사용하려는 경우 기존 사이즈보다 하나 큰 사이즈의 배열을 선언해야 한다.
    public MyQueueByCircularArr() {
        arr = new int[11];
    }

    public MyQueueByCircularArr(int capacity) {
        arr = new int[capacity + 1];
    }

    public void enqueue(int num) {
        if ((rear+1)%arr.length == front) {
            throw new RuntimeException("용량이 초과 되었습니다.");
        }
        arr[rear] = num;
        rear = (rear + 1) % arr.length; //회전 큐
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        int ans = arr[front];
        front = (front + 1) % arr.length;
        return ans;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front];
    }

    public int capacity() {
        return arr.length - 1;
    }

    public int size() {
        return (rear - front + arr.length) % arr.length;
    }

    public boolean isEmpty() {
        return rear == front;
    }
}
