package com.hillel.java.objects;

public class Cat {

  private String name;
  private int age;
  private Color color;

  public Cat() {
    /*
    this.name = "Unknown";
    this.age = 5;
    this.color = Color.RED;
    */
    this("Unknown", 5, Color.RED);
  }

  public Cat(String name, int age, Color color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
}
