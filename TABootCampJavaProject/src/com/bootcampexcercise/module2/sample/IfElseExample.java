package com.bootcampexcercise.module2.sample;

public class IfElseExample {

    public static void main(String args[]) {
        int x = 10;
        int y = 88;
        int z = 2;

        if (x > y & x > z) {
            System.out.println("x is largest");
        } else if (y > x & y > z) {
            System.out.println("y is largest");
        } else {
            System.out.println("z is largest");
        }


    }
}
