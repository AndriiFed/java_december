package com.lessons.collections;

public class MainCustom {
  public static void main(String[] args) {
    CustomList list = new CustomArrayList();

    for (Object s : list) {
      System.out.println(s);
    }
  }
}
