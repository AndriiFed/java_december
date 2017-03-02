package com.hillel.collections;

import java.util.HashMap;
import java.util.Map;

public class StandardMapTest {
  public static void main(String[] args) {

    Student john = new Student("john", "doe", 30);
    Student sam = new Student("sam", "red", 20);
    Student kathy = new Student("kathy", "whomp", 25);

    Grade grade1 = new Grade(5, "A");
    Grade grade2 = new Grade(4, "B");

    Map<Student, Grade> map = new HashMap<>();
    map.put(john, grade1);
    map.put(sam, grade1);
    map.put(kathy, grade2);
  }
}
