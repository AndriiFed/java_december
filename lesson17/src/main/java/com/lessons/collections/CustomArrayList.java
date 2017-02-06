package com.lessons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomArrayList implements CustomList {

  private static final int INITIAL_CAPACITY = 10;

  private String[] array;

  private int size = 0;

  public CustomArrayList() {
    this(INITIAL_CAPACITY);
  }

  public CustomArrayList(int capacity) {
    array = new String[capacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public boolean contains(String element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].equals(element)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void add(String element) {
    resizeArray();
    array[size] = element;
    size++;
  }

  private void resizeArray() {
    if (size == array.length) {

    }

  }

  @Override
  public void add(int index, String element) {

  }

  @Override
  public void remove(String element) {
    int index = indexOf(element);
    for (int i = index + 1; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    array[size - 1] = null;
    size--;
  }

  @Override
  public String remove(int index) {
    return null;
  }

  @Override
  public void clear() {
    size = 0;
    resizeArray();
  }

  @Override
  public String get(int index) {
    return array[index];
  }

  @Override
  public String get(int index, String element) {
    return null;
  }

  @Override
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (array[i].equals(element)) {
        return i;
      }
    }

    throw new NoSuchElementException("No such element in the list");
  }

  @Override
  public Iterator iterator() {
    return new ListIterator();
  }

  public Iterator backwardIterator() {
    return new BackwardListIterator();
  }

  public Iterator randomIterator() {
    return new RandomListIterator();
  }

  private class ListIterator implements Iterator {

    private int current;

    ListIterator() {
      current = 0;
    }

    @Override
    public boolean hasNext() {
      return current < size;
    }

    @Override
    public Object next() {
      String element = array[current];
      current++;

      return element;
    }
  }

  private class BackwardListIterator implements Iterator {

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public Object next() {
      return null;
    }
  }

  private class RandomListIterator implements Iterator {

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public Object next() {
      return null;
    }
  }


}
