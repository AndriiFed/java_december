package com.hillel.java.builders;

import java.util.StringJoiner;

public class BuilderExample {
  public static void main(String[] args) {

    String str = "first";
    str += "second";
    str += "third";

    System.out.println(str);

    String str1 = "";
    for (int i = 0; i < 5; i++) {
      str1 += "element " + i;
    }
    System.out.println(str1);

    StringBuilder str2 = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      str2.append("element ");
      str2.append(i);
    }
    System.out.println(str2.toString());

    StringJoiner joiner = new StringJoiner(",", "[", "]");
    for (int i = 0; i < 5; i++) {
      joiner.add("element " + i);
    }
    System.out.println(joiner.toString());
  }
}
