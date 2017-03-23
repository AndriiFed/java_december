package com.hillel.java.enums;

public enum Color {
    RED("Red Color", 0xFF0000),
    PURPLE("Purple Color", 0x5F3D70),
    BLACK("Black Color", 0x000000),
    WHITE("White Color", 0xFFFFFF);

    private String name;
    private int index;

    private Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
