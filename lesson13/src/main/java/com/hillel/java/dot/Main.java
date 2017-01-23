package com.hillel.java.dot;


public class Main {
  public static void main(String[] args) {
    Point point1 = new Point(0, 0);
    System.out.println(point1);
    Point point2 = new Point(2, 6);
    int distance = point1.distance(point2);
    System.out.println(distance);
  }

}
