package com.hillel.java.enums;

public class Main {

    public static void main(String[] args) {

        /*
        int color = ConstantsPattern.BLACK;
        color = 5;
        */

        Color color1 = Color.BLACK;

        for (Color color : Color.values()) {
            //String value = color.name();
            //int num = color.ordinal();

            String value = color.getName();
            int num = color.getIndex();

            System.out.println(value + " - " + num);
        }

        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.someAction();
    }
}
