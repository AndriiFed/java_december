package com.hillel.lessons.collections;

import java.util.Arrays;

public class CustomStack {

  public static final int CAPACITY = 10;
  private String[] array;
  private int pointer = 0;

  public CustomStack() {
    this(CAPACITY);
  }

  public CustomStack(int capacity) {
    array = new String[capacity];
  }

  public void push(String item) {
    if (pointer == array.length) {
      throw new StackOverflowError("StackOverflow");
    }
    array[pointer++] = item;
  }

  public String pop() {
    String item = array[--pointer];
    array[pointer] = null;
    return item;
  }

  public String peek() {
    return array[pointer - 1];
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }
}
