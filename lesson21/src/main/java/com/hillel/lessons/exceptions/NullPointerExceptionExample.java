package com.hillel.lessons.exceptions;

public class NullPointerExceptionExample {
  public static void main(String[] args) {
    String message = "asdfasdfds";
    if (message != null) {
      int len = message.length();
      System.out.println(len);
    }

    int result = divide(5, 0);
  }

  public static int divide(int a, int b) {
    if (b == 0) {
      return 0;
    }

    return a / b;
  }
}
