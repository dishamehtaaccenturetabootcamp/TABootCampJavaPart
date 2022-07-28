package com.bootcampexcercise.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    //TODO: 1 - Type main method
    public static void main(String args[]) {
        //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
        ArithmeticExceptionActivity arithmeticExceptionActivity = new ArithmeticExceptionActivity();
        arithmeticExceptionActivity.catchMe(10, 0);
        //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed
        arithmeticExceptionActivity.catchMe(10, 2);
    }


    void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        //TODO: 3 - Identify the exception and write code to handle this exception.
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        } catch (ArithmeticException a) {
            System.out.println("Inputs passed in method are incorrect");
        } finally {
            //TODO: 4 - After handling the exception, write a finally block which
            //prints a message "Thank you for using this program."
            System.out.println("Thank you for using this program.");
        }


    }

}
