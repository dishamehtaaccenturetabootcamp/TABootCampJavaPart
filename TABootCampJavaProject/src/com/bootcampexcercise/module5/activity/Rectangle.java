package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {

    // TODO: Implement calculateArea and calculatePerimeter in this class
    // I am just using this 3 param approach to show you another way. Because everyone is using empty parameter way
    public double calculateArea(double length, double breadth, double radius) {
        return length * breadth;
    }

    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}
