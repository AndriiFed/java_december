package com.hillel.lessons.trees;

import java.util.TreeMap;

public class JavaTreesExample {

    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(9, "Sam");
        tree.put(10, "Kathy");
        tree.put(1, "John");
        tree.put(5, "Nick");
        tree.put(6, "John");
        tree.put(3, "John");
        tree.put(8, "John");
        tree.put(9, "Mick");
    }
}
