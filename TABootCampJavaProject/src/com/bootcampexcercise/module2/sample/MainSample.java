package com.bootcampexcercise.module2.sample;

// Import of libraries or dependent classes

/**
 * @author disha.k.mehta
 * @Purpose Explain class structure
 */
public class MainSample { // Class declaration
    // Execution always starts from main method
    public static void main(String []args) {
        int i, j; // Variable declaration
        i = 5; // Assign Value to i
        j = 7; // Assign value to j
        int sum = i + j;
        // Print to show different between ammend and summation function
        System.out.println("Sum of i and j is" + i + j);
        System.out.println("Sum of i and j is" + (i + j));
        System.out.println("Sum of i and j is" + sum);

        // Output of above 3 souts
        /*Sum of i and j is57
        Sum of i and j is12
        Sum of i and j is12*/
    }
}
