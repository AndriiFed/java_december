package com.hillel.java.ser;

import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = -6849794470754667710L;

    private String name;
    private int age;
    private Owner owner;

    private int dummy;

    public Dog(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }
}
