package com.bootcampexcercise.module7.sample;

// Needs to be completed
public class ErrorSample {

    //This is an example of an error which cannot be handled programmatically
    public static void main(String arg[]) {
        infinity();
    }

    //Below method calls itself and
    //it happens infinite times because there is no exit condition
    //At one point in time, JVM would give up and show StackOverflowError
    static int count = 0;

    public static void infinity() {
        //1 - Print a message
        System.out.println("we are in infinity method");

        //2 - Call infinity()
//        infinity();
        // This is call recursive method call and it should have some exit.
        // Sometimes people forget to add exits to such condition

        // Here is the solution

        System.out.println("we are in infinity method");
        count++;
        while (count < 10) {
            infinity();
        }
    }
}
