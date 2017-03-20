package com.hillel.lessons.trees;

public class CustomTreeMain {

    public static void main(String[] args) {
        CustomTree customTree = new CustomTree();
        customTree.add(9, "Sam");
        customTree.add(10, "Nick");
        customTree.add(1, "Owen");
        customTree.add(5, "Kathy");
        customTree.add(6, "Jack");
        customTree.add(3, "Robert");
        customTree.add(8, "Karry");

        customTree.traverse();
    }
}
