package com.hillel.lessons.collections;

import java.util.NoSuchElementException;

public class CustomList<E> {

  private Node first;
  private Node last;

  public void add(E item) {
    Node node = new Node(item, null);

    if (last == null) {
      first = node;
    } else {
      last.next = node;
    }

    last = node;
  }

  public E poll() {
    E item = first.value;
    first = first.next;
    return item;
  }

  public Object peek() {
    return first.value;
  }

  public E get(int index) {
    int currentIndex = 0;
    Node current = first;
    while (current != null && currentIndex < index) {
      currentIndex++;
      current = current.next;
    }

    if (current == null) {
      throw new NoSuchElementException("No such element in queue");
    }

    return current.value;
  }

  public void introduceCycle(int index) {

  }

  public boolean hasCycle() {
    return false;
  }

  @Override
  public String toString() {
    /*
    StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
    Node current = first;
    while (current != null) {
      stringJoiner.add(current.value);
      current = current.next;
    }
    return stringJoiner.toString();
    */
    return super.toString();
  }

  private class Node {
    E value;
    Node next;

    Node(E value, Node next) {
      this.value = value;
      this.next = next;
    }
  }
}
