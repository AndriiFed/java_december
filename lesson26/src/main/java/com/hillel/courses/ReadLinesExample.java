package com.hillel.courses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadLinesExample {
  public static void main(String[] args) {

    File file = new File("e:\\text.txt");

    BufferedReader bufferedReader = null;
    try {
      FileReader fileReader = new FileReader(file);
      bufferedReader = new BufferedReader(fileReader);

      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        bufferedReader.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
