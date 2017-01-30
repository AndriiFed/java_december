package com.hillel.calculator;


public class Multiplication implements BasicOperation{
  @Override
  public double operation(int op1, int op2) {
    return op1 * op2;
  }
}
