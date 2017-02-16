package com.hillel.examples;

public class InstanceOfExample {

  public static void main(String[] args) {
    Dog dog = new Dog();

    System.out.println("First:");
    System.out.println(dog instanceof Animal);
    System.out.println(dog instanceof Dog);

    Animal animal = new Dog();

    System.out.println();

    System.out.println("Second:");
    System.out.println(animal instanceof Animal);
    System.out.println(animal instanceof Dog);

    Animal pureAnimal = new Animal();

    System.out.println();
    System.out.println("Third");
    System.out.println(pureAnimal instanceof Animal);
    System.out.println(pureAnimal instanceof Dog);
  }
}
