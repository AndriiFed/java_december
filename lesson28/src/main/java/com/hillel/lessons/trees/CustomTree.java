package com.hillel.lessons.trees;

public class CustomTree {

    private Node root;

    public void add(Integer key, String value) {

        Node node = new Node(key, value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;
        while (true) {
            if (current.key == key) {
                current.value = value;
                return;
            }

            if (key < current.key) {
                if (current.left == null) {
                    current.left = node;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = node;
                    return;
                }
                current = current.right;
            }
        }
    }

    public void traverse() {
        traverseTree(root);
    }

    private void traverseTree(Node current) {
        if (current == null) {
            return;
        }

        traverseTree(current.left);
        System.out.println(current.key + " - " + current.value);
        traverseTree(current.right);
    }

    private static class Node {

        private Integer key;
        private String value;

        private Node left;
        private Node right;

        Node(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
