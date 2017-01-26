package com.hillel.lessons;

public class Cat extends Animal {

  public Cat(String name, int age) {
    super(name, age);
  }

  public void meow() {
    System.out.println("Meow...");
  }

  @Override
  public String toString() {
    return super.getName();
  }

  @Override
  public boolean equals(Object obj) {
    String name = super.getName();

    Cat cat = (Cat) obj;
    String anotherName = cat.getName();

    return name.equals(anotherName);
  }
}
