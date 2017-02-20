package com.hillel.lessons.exceptions;

public class StackOverflowExceptionExample {
  public static void main(String[] args) {
    someFunction();
  }

  public static void someFunction() {
    someFunction();
  }
}
