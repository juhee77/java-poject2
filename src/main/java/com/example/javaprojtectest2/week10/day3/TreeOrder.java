package com.example.javaprojtectest2.week10.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeOrder {
    private int nodes;
    private int[] arr;  // 이진 트리를 표현하기 위한 배열

    // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }
    public void setArr(int[] arr) {
        this.arr = arr;
        this.nodes = arr.length;
    }

    // 전위 순회 V -> L -> R
    // preorder(): System.out.print(V) -> preorder(L) -> preorder(R)
    public void traversePreorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            System.out.print(arr[node] + ", ");   // 방문
            this.traversePreorder(node * 2);      // 왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            this.traversePreorder(node * 2 + 1);  // 오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
        }
    }

    // 중위 순회 L -> V -> R
    // inorder(): preorder(L) -> System.out.print(V) -> preorder(R)
    public void traverseInorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traverseInorder(node * 2);       // 왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            System.out.print(arr[node] + ", ");   // 방문
            this.traverseInorder(node * 2 + 1);   // 오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
        }
    }

    // 중위 순회 L -> R -> V
    // inorder(): preorder(L) -> preorder(R) -> System.out.print(V)
    public void traversePostorder(int node) {
        if (node < this.nodes && arr[node] != 0) {
            this.traversePostorder(node * 2);       // 왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            this.traversePostorder(node * 2 + 1);   // 오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
            System.out.print(arr[node] + ", ");   // 방문
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int[] nodes = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TreeOrder treeOrder = new TreeOrder();
        treeOrder.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});

        treeOrder.traversePreorder(1);
        System.out.println();
        treeOrder.traverseInorder(1);
        System.out.println();
        treeOrder.traversePostorder(1);
        System.out.println();
    }
}
