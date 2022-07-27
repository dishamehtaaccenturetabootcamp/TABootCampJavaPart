package com.bootcampexcercise.module5.activity;

/**
 * @author disha.k.mehta
 * Activity 2
 */
//TODO: change Shape class to abstract
public abstract class Shape {

    public String color;

    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea(double length, double breadth, double radius);

    public abstract double calculatePerimeter(double length, double breadth, double radius);

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }


}
