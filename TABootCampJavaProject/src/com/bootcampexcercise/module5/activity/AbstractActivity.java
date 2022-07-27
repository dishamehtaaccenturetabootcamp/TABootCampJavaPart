package com.bootcampexcercise.module5.activity;

import org.w3c.dom.css.Rect;

/**
 * Activity 3
 */
public class AbstractActivity {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        // set and Print color of rectangle
        rectangle.setColor("Blue");
        System.out.println(rectangle.getColor());
        // Give area of rectangle
        System.out.println("Rectangle Area " + rectangle.calculateArea(2, 4, 0));

        // Print perimeter of rectangle
        System.out.println("Rectangle Area " + rectangle.calculatePerimeter(2, 4, 0));

        Circle circle = new Circle();
        // set and Print color of circle
        circle.setColor("Pink");
        System.out.println(circle.getColor());
        // Give area of circle
        System.out.println("Circle Area " + circle.calculateArea(0, 0, 5));
        // Print perimeter of circle
        System.out.println("Circle Perimeter " + circle.calculatePerimeter(0, 0, 5));
    }
}
