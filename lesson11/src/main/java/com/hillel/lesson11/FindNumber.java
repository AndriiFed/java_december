package com.hillel.lesson11;

/**
 * Created by User on 22.01.2017.
 */
public class FindNumber {
  public static boolean number(int n, int[] array) {
    int first = 0;
    int last = array.length - 1;
    while (first != last) {
      int middle = (first + last) / 2;
      if (array[middle] == n) {
        return true;
      }

      if (array[middle] <= n) {
        first = middle + 1;
      } else {
        last = middle - 1;
      }

    }
    return false;
  }
}
