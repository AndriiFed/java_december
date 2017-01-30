package com.hillel.calculator;

public class Calculator {

  public Integer calculate(String operation, int op1, int op2) {

    Integer result = null;

    switch (operation) {
      case "addition":
        result = op1 + op2;
        break;
      case "subtraction":
        result = op1 - op2;
        break;
      case "multiplication":
        result = op1 * op2;
        break;
      case "division":
        result = op1 / op2;
        break;
    }

    return result;
  }
}
