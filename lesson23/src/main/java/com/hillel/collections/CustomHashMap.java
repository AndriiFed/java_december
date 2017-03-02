package com.hillel.collections;

public class CustomHashMap {

  private static final int SIZE = 10;
  private Node[] array;

  public CustomHashMap() {
    array = new Node[SIZE];
  }

  public void put(Student key, Grade value) {
    int index = calculateHashCode(key);

    Node node = new Node(key, value);
    if (array[index] == null) {
      array[index] = node;
      return;
    }

    Node current = array[index];
    while (current.next != null) {
      current = current.next;
    }
    current.next = node;
  }

  public Grade get(Student key) {
    int index = calculateHashCode(key);

    Node node = array[index];
    while (node != null) {
      if (node.key.equals(key)) {
        return node.value;
      }
      node = node.next;
    }

    return null;
  }

  private int calculateHashCode(Student key) {
    int index = Math.abs(key.hashCode()) % SIZE;
    return index;
  }

  private class Node {
    private Student key;
    private Grade value;
    private Node next;

    public Node(Student key, Grade value) {
      this.key = key;
      this.value = value;
    }
  }
}
