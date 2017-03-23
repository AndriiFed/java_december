package com.hillel.java.ser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public static void main(String[] args) throws IOException {

        Owner owner = new Owner("John", "Wayne", 35);
        Dog dog = new Dog("Pluto", 3, owner);


        FileOutputStream fileOutputStream =
                new FileOutputStream("/home/hillel/projects/dog.ser");

        ObjectOutputStream stream =
                new ObjectOutputStream(fileOutputStream);

        stream.writeObject(dog);
    }
}
