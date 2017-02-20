package com.hillel.lessons.exceptions;

public class SeveralMethodsExample {
  public static void main(String[] args) {
    method1();
  }

  public static void method1() {
    method2();
  }

  private static void method2() {
    method3();
  }

  private static void method3() {
    method4();
  }

  private static void method4() {
    throw new RuntimeException();
  }
}
