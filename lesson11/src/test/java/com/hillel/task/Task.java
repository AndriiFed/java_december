package com.hillel.task;

import com.hillel.lesson11.FindNumber;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by User on 22.01.2017.
 */
public class Task {

  @Test
  public void testLog() {
    int[] array = {1, 5, 9, 11, 13, 15, 36, 78, 105};
    int n = 36;
    assertThat(FindNumber.number(n , array), is (true));
  }

  @Test
  public void negativeTest(){
    int[] array = {1, 5, 9, 11, 13, 15, 36, 78, 105};
    int n = 12;
    assertThat(FindNumber.number(n , array), is (false));

  }

}
