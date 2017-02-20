package com.hillel.lessons.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExampleFile {
  public static void main(String[] args) {

    File file = new File("c:\\1.txt");

    FileReader fileReader = null;
    try {
      fileReader = new FileReader(file);
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        fileReader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public void tryWithResources() {
    File file = new File("c:\\1.txt");

    try (FileReader fileReader = new FileReader(file)) {
      fileReader.read();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
