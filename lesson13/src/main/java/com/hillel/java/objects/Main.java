package com.hillel.java.objects;

public class Main {
  public static void main(String[] args) {
    Cat cat = new Cat("Murzik", 5, Color.RED);

    Cat cat1 = new Cat();

    System.out.println(cat.getName());
    System.out.println(cat.getAge());
  }
}
