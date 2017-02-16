package com.hillel.examples;

public class Student implements Comparable<Student> {
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (obj.getClass() != this.getClass()) {
      return false;
    }

    Student student = (Student) obj;

    if (student.name == null) {
      return false;
    }

    if (!student.name.equals(name)) {
      return false;
    }

    if (student.age != age) {
      return false;
    }

    return true;
  }

  @Override
  public String toString() {
    return name + " : " + age;
  }

  @Override
  public int compareTo(Student student) {
    return student.age - this.age;
    //return student.name.compareTo(this.name);
  }
}
