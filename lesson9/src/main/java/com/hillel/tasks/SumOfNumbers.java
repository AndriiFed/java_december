package com.hillel.tasks;

public class SumOfNumbers {

  public int getSum(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
      sum = sum + i;
    }
    return sum;
  }
}
