package com.example.javaprojtectest2.week10.day4;

import java.util.NoSuchElementException;

public class BinarySearchTreeWhile {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    Node root = null;

    //insertion
    public void insertionWhile(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Node now = root;
            while (true) {
                if (now.value < data) {
                    if (now.right == null) {
                        now.right = new Node(data);
                        break;
                    }
                    now = now.right;

                } else {
                    if (now.left == null) {
                        now.left = new Node(data);
                        break;
                    }
                    now = now.left;
                }
            }
        }

    }

    //deletion
    public void deletionWhile(int data) {
        Node parent = null;
        Node current = root;

        while (current != null && current.value != data) {
            parent = current;
            if (current.value < data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        if (current == null) {
            throw new NoSuchElementException("없는 데이터 입니다.");
        }


        if (current.left != null && current.right != null) {
            // 두 쪽 모두에 자식이 있는 경우 왼쪽 자식중 가장 큰 값
            Node replacementParent = current;
            Node replacement = current.left;

            while (replacement.right != null) {
                replacementParent = replacement;
                replacement = replacement.right;
            }

            //루트인 경우
            if (replacement == current.left) replacementParent.left = null;
            else replacementParent.right = null;
            current.value = replacement.value;

        } else {
            //남아있는 자식을 고른다.
            Node child;
            if (current.left == null && current.right == null) child = null;
            else child = (current.left != null) ? current.left : current.right;

            //그리고 자식을 넣는다.
            if (parent == null) root = child;
            else if (parent.left == current) parent.left = child;
            else parent.right = child;
        }
    }


    //search
    public boolean searchWhile(int data) {
        Node now = root;
        while (now != null) {
            if (now.value == data) {
                return true; //find
            } else if (now.value < data) {
                now = now.right;
            } else {
                now = now.left;
            }
        }
        return false;
    }

    public void inorderTraversal() {
        System.out.print("[INORDER]");
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }


    public static void main(String[] args) {
        System.out.println("\nWHILE ---------------");

        BinarySearchTreeWhile bTree = new BinarySearchTreeWhile();
        bTree.insertionWhile(20);
        bTree.insertionWhile(10);
        bTree.insertionWhile(30);
        bTree.insertionWhile(5);
        bTree.insertionWhile(15);
        bTree.insertionWhile(25);
        bTree.insertionWhile(35);
        bTree.inorderTraversal();

        System.out.println(bTree.searchWhile(3));
        System.out.println(bTree.searchWhile(5));


        bTree.deletionWhile(10);
        bTree.deletionWhile(5);
        bTree.deletionWhile(15);
        bTree.deletionWhile(20);
        System.out.println(bTree.root);
        bTree.deletionWhile(25);
        bTree.deletionWhile(35);
        bTree.deletionWhile(30);
        System.out.println(bTree.root);

        bTree.inorderTraversal();
    }
}
