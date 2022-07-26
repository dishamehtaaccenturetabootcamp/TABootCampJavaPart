package com.bootcampexcercise.module2.sample;

/**
 * Explain Array
 */
public class ArrayExample {
    public static void main(String args[]) {
        String[] stringArray = {"Hello", "How", "Are", "You"}; // Array declaration
        // Array index always starts with zero
        System.out.println("0th index of array has " + stringArray[0] + " " + stringArray[1] + " " + stringArray[2] + " " + stringArray[3]);
        // We can modify array elements using the index
        stringArray[0] = "Hi";
        System.out.println("0th index of array has " + stringArray[0] + " " + stringArray[1] + " " + stringArray[2] + " " + stringArray[3]);
    }
}
