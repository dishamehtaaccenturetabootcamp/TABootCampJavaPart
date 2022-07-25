package com.bootcampexcercise.module2.sample;

public class OperatorSuffixAndPrefix {

    public static void main(String args[]) {
        // Value of x is 9 here
        int x = 9;
        // As we have prefixed -- , value of x would be reduced before it is assigned to y
        int y = --x;
        System.out.println("Value of y is " + y + " Value of x is " + x);
        // As we have suffixed -- , value of x would be reduced after the assignment so value of x is 7 and z still remains 8
        int z = x--;
        System.out.println("Value of z is " + z + " Value of x is " + x);
    }
}
