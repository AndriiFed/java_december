package com.hillel.courses;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileExample {

  public static void main(String[] args) {
    String path = "e:\\hello.txt";

    int[] symbols = readFile(path);

    writeFile(symbols, "e:\\hello_output.txt");
  }

  private static void writeFile(int[] symbols, String path) {
    File file = new File(path);

    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);

      for (int symbol : symbols) {
        fileWriter.write(symbol);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        fileWriter.flush();
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static int[] readFile(String path) {
    File file = new File(path);

    try (FileReader fileReader = new FileReader(file)) {

      int[] symbols = new int[(int)file.length()];

      int symbol;
      int i = 0;
      while ((symbol = fileReader.read()) != -1) {
        symbols[i] = symbol;
        i++;
      }

      return symbols;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

}
