package com.bootcampexcercise.module2.sample;

/**
 * @author disha.k.mehta
 * @Purpose to explain for loop
 */
public class ForLoopExample {

    public static void main(String args[]) {
        // we want perform sum of first 10 numbers starting from 1
        int sum = 0; // initialize sum variable
        for (int i = 1; i <= 10; i++) { // for loop repeats the action until the condition is true
            // initial, no of counts, increment/decrement
            sum = sum + i;
        }
        System.out.println("Sum of first 10 numbers is " + sum);
    }
}
