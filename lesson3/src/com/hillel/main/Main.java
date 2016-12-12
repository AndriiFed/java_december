package com.hillel.main;

import com.hillel.calc.Calculator;
//import java.lang.Integer;

public class Main {
  public static void main(String... args) {
    String param1 = args[0];
    String param2 = args[1];

    int n1 = Integer.parseInt(param1);
    int n2 = Integer.parseInt(param2);

    int result = Calculator.sum(n1, n2);

    System.out.println("Result is " + result);
  }
}
