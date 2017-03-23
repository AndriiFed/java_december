package com.hillel.java.ser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream =
                new FileInputStream("/home/hillel/projects/dog.ser");

        ObjectInputStream stream =
                new ObjectInputStream(fileInputStream);

        Dog dog = (Dog) stream.readObject();

        System.out.println(dog);
    }
}
