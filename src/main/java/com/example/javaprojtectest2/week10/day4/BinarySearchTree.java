package com.example.javaprojtectest2.week10.day4;

public class BinarySearchTree {
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


    // 삽입 메소드
    public void insert(int key) {
        root = insertNode(root, key);
    }


    public Node insertNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (node.value == value) { //본인과 같은
            return node;
        } else if (node.value < value) {
            node.right = insertNode(node.right, value);
        } else {
            node.left = insertNode(node.left, value);
        }

        return node;
    }

    //deletion
    public void deletion(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.value) {
            node.left = deleteNode(node.left, data);
        } else if (data > node.value) {
            node.right = deleteNode(node.right, data);
        } else { //목표 타켓 찾음
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            Node successor = findSuccessor(node.right);
            node.value = successor.value;
            node.right = deleteNode(node.right, successor.value);
        }
        return node;
    }

    private Node findSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    //search
    public boolean search(int data) {
        return searchNode(root, data);
    }

    public boolean searchNode(Node now, int data) {
        if (now == null) return false;

        if (now.value == data) {
            return true; //find
        } else if (now.value < data) {
            return searchNode(now.right, data);
        } else {
            return searchNode(now.left, data);
        }
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
        System.out.println("RECURSION ---------------");
        BinarySearchTree bTree = new BinarySearchTree();
        bTree.insert(20);
        bTree.insert(10);
        bTree.insert(30);
        bTree.insert(5);
        bTree.insert(15);
        bTree.insert(25);
        bTree.insert(35);
        bTree.inorderTraversal();

        System.out.println(bTree.search(3));
        System.out.println(bTree.search(5));

        bTree.deletion(10);
        bTree.inorderTraversal();
        bTree.deletion(5);
        bTree.deletion(15);
        bTree.deletion(20);
        bTree.deletion(25);
        bTree.deletion(35);
        bTree.deletion(30);

        System.out.println(bTree.root);
        bTree.inorderTraversal();
    }
}
