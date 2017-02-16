package com.hillel.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
  public static void main(String[] args) {
    Student student = new Student("John", 20);
    Student student1 = new Student("John", 20);

    System.out.println(student.equals(student1));

    List<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(3);
    numbers.add(1);
    numbers.add(2);
    numbers.add(-8);

    System.out.println("Unsorted list: " + numbers);

    Collections.sort(numbers);

    System.out.println("Sorted list: " + numbers);

    List<Student> students = new ArrayList<>();
    students.add(new Student("John", 5));
    students.add(new Student("John", 3));
    students.add(new Student("John", 1));
    students.add(new Student("John", 3));
    students.add(new Student("John", 12));

    System.out.println("Unsorted list: " + students.toString());

    Collections.sort(students);

    Collections.sort(students, new CompareStudentsByName());

    System.out.println(students);

    Collections.sort(students, (o1, o2) -> o2.getAge() - o1.getAge());
  }
}
