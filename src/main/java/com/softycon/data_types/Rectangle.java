package com.softycon.data_types;

public class Rectangle {
    private int length, breadth;

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }
    void calculatePerimeter() {
        System.out.println("Perimeter of the Rectangle is : "+(2*(length+breadth)));
    }
}
