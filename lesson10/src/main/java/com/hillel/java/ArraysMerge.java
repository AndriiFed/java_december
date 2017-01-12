package com.hillel.java;

import java.util.Arrays;

public class ArraysMerge {
  public static void main(String[] args) {
    int[] firstArray = {1, 4, 6, 8};
    int[] secondArray = {3, 9, 12};

    ArraysMerge arraysMerge = new ArraysMerge();
    int[] result = arraysMerge.merge(firstArray, secondArray);

    System.out.println(Arrays.toString(result));
  }

  public int[] merge(int[] firstArray, int[] secondArray) {
    int resultLength = firstArray.length + secondArray.length;
    int[] result = new int[resultLength];

    int firstIndex = 0;
    int secondIndex = 0;
    for (int i = 0; i < resultLength; i++) {

      if (firstIndex >= firstArray.length) {
        result[i] = secondArray[secondIndex];
        secondIndex++;
        continue;
      }

      if (secondIndex >= secondArray.length) {
        result[i] = firstArray[firstIndex];
        firstIndex++;
        continue;
      }

      if (firstArray[firstIndex] < secondArray[secondIndex]) {
        result[i] = firstArray[firstIndex];
        firstIndex++;
        continue;
      }

      if (firstArray[firstIndex] >= secondArray[secondIndex]){
        result[i] = secondArray[secondIndex];
        secondIndex++;
        continue;
      }

    }

    return result;
  }
}
