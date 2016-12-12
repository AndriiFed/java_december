package com.hillel.calc;

public class ThreeNumbers {
  public static void main(String... args) {
    int a = 3;
    int b = 5;
    int c = 4;

    int min;

    if (a < b) {
      if (a < c) {
        min = a;
      } else {
        min = c;
      }
    } else {
      if (b < c) {
        min = b;
      } else {
        min = c;
      }
    }

    System.out.println(min);
  }
}
