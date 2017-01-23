package com.hillel.java.dot;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int distance(Point point) {
    int distence = (int) Math.sqrt((point.x-this.x)*(point.x- this.x)+
        (point.y- this.y)*(point.y- this.y));
    return distence;
  }

  @Override
  public String toString() {
    return String.valueOf(x) + ", " + String.valueOf(y);
  }
}
