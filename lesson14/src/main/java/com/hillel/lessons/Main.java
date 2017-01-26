package com.hillel.lessons;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("something", 5);

    Cat barsik = new Cat("Barsik", 3);
    Cat murzik = new Cat("Barsik", 3);

    Dog pluto = new Dog("Pluto", 9);

    barsik.eat();
    barsik.growUp();
    barsik.meow();

    pluto.eat();
    pluto.growUp();
    pluto.bark();

    System.out.println(barsik.toString());

    if (barsik.equals(murzik)) {
      System.out.println("Cats are equals");
    } else {
      System.out.println("Cats are different");
    }
  }
}
