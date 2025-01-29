package com.example.bread;

public abstract class Shape {
    private int x;
    private int y;
    String color2 = "brown";
    String color3 = "cyan";
    String color = "magenta";
    String color4 = "maroon";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
