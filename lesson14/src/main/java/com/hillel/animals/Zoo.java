package com.hillel.animals;

public class Zoo {
  public static void main(String[] args) {

    /*
    Animal animal = new Animal();
    animal.voice();
    */

    Dog dog = new Dog();
    dog.voice();

    Cat cat = new Cat();
    cat.voice();

    Animal pluto = new Dog();
    Animal barsik = new Cat();
    Animal anfisa = new Monkey();

    Animal[] animals = new Animal[3];
    animals[0] = pluto;
    animals[1] = barsik;
    animals[2] = anfisa;

    for (int i = 0; i < animals.length; i++) {
      animals[i].voice();
      //animals[i].eat();
    }

    //Animal.someVar;
  }
}
