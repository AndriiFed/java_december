package com.hillel.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

  @Test
  public void testAddition() {
    Calculator calc = new Calculator();
    int res = calc.calculate("addition", 5, 3);
    assertThat(res, is(8));
  }
}
