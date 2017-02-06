package com.lessons.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("basd");
    list.add("cf");

    Iterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) {
      String current = iterator.next();
      System.out.println(current);
    }

    for (String element : list) {
      System.out.println(element);
    }

    List<Integer> lst = list.stream()
        .map(e -> e.length())
        .collect(Collectors.toList());

    System.out.println(lst);
  }
}
