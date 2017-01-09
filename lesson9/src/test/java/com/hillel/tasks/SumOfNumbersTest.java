package com.hillel.tasks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SumOfNumbersTest {

  @Test
  public void testSum() {
    SumOfNumbers sumOfNumbers = new SumOfNumbers();
    int result = sumOfNumbers.getSum(100);

    assertThat(result, is(5050));
  }
}
