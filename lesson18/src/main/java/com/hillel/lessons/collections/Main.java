package com.hillel.lessons.collections;

public class Main {
  public static void main(String[] args) {
    CustomStack stack = new CustomStack();
    stack.push("first");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    stack.push("second");
    String element = stack.pop();

    System.out.println(stack);
  }
}
