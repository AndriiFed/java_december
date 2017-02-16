package com.hillel.examples;

public class GetClassExample {
  public static void main(String[] args) {

    Dog dog = new Dog();
    System.out.println("First:");
    System.out.println(dog.getClass());

    Animal animal = new Dog();
    System.out.println("Second");
    System.out.println(animal.getClass());

    Animal pureAnimal = new Animal();
    System.out.println("Third");
    System.out.println(pureAnimal.getClass());
  }
}
