package com.example.javaprojtectest2.week10.day2;

import java.util.Objects;

public class MyLinkedList {

    private static class Node {
        private int data;
        private Node link;// 뒤쪽과의 링크

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node link) {
            this.data = data;
            this.link = link;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", link=" + link +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node node)) return false;

            if (data != node.data) return false;
            return Objects.equals(link, node.link);
        }

        @Override
        public int hashCode() {
            int result = data;
            result = 31 * result + (link != null ? link.hashCode() : 0);
            return result;
        }


    }


    private Node head;

    //add
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node now = head;
            while (now.link != null) {
                now = now.link;
            }
            now.link = new Node(data);
        }
    }

    //get
    public Node get(int index) {
        Node now = head;
        for (int i = 1; i <= index; i++) {
            now = now.link;
        }
        return now;
    }

    //remove
    public Node remove(int index) {

        Node now = head;
        if (index == 0) {
            head = head.link;
        } else {
            int i = 0;
            Node previous = head;
            while (i < index && now != null) {
                previous = now;
                now = now.link;
                i++;
            }

            if (now == null) throw new RuntimeException("Illegal Index");
            previous.link = now.link;
        }

        now.link = null;
        return now;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node now = head;
        while (now != null) {
            sb.append(now.data).append(" ");
            now = now.link;
        }
        return sb.toString();
    }

    //size


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList);
        System.out.println();

        System.out.println("[GET]");
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println();

        System.out.println("[REMOVE]");
        System.out.println(myLinkedList.remove(0));
        System.out.println(myLinkedList.remove(2));
        System.out.println();
        System.out.println(myLinkedList);
    }

}
