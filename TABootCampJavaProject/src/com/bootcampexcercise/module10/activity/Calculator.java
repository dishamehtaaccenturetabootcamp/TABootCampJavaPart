package com.bootcampexcercise.module10.activity;

import com.bootcampexcercise.module10.activity.CustomException;

/**
 * @author disha.k.mehta
 * Activity 3
 */
public class Calculator {

    // add method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        double result = 0;
        try {
            if (a == 0 || b == 0)
                throw new CustomException();
            else
                result = a * b;

        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public double divide(double a, double b) {
        double result = 0;
        try {
            if (a == 0 || b == 0)
                throw new ArithmeticException();
            else
                result = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Invalid input in divide");
        }
        return result;
    }
}
