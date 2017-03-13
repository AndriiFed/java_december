package com.hillel.courses;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertFileExample {
  public static void main(String[] args) {

    File file = new File("e:\\text.txt");

    try (FileReader fileReader = new FileReader(file);
         BufferedReader bufferedReader = new BufferedReader(fileReader)) {


      Map<String, Integer> map = new HashMap<>();

      String line;
      while ((line = bufferedReader.readLine()) != null) {

        String[] words = line.split(" ");
        for (String word : words) {

          word = word.replaceAll("[,:-]", "");

          Integer value = 1;
          if (map.containsKey(word)) {
            value = map.get(word) + 1;
          }
          map.put(word, value);
        }

      }

      BufferedWriter writer =
          new BufferedWriter(new FileWriter("e:\\text_output.txt"));

      Set<String> words = map.keySet();
      for (String word : words) {
        String pair = word + " " + map.get(word);
        writer.write(pair);
        writer.newLine();
      }

      writer.flush();
      writer.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
