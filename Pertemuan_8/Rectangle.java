package com.pboreg;

public class Rectangle extends Shape {
    private int length,width;

    private Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    public String toString(){
        return "Rectangle";
    }
}
