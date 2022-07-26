package com.bootcampexcercise.module2.sample;

/**
 * @author disha.k.mehta
 * @Purpose To demostrate Variable scope - Only Class and method/local variables
 */
public class VariableScopeExample {

    // Class var declaration
    static String classVar = "Class Variable Scope";

    public static void main(String[] args) {

        method1();
        method2();
        method3();
    }

    /**
     * This method demostrates class variable access inside method
     */
    public static void method1() {
        // Class var re-assignment as needed
        classVar = "Class variable accessed in method1";
        System.out.println("method1 class var value " + classVar);
    }

    /**
     * This method demostrates local variable
     */
    public static void method2() {
        // local variable declaration
        int method2Var = 3456;
        System.out.println("Method 2 Varaible: " + method2Var);
    }

    /**
     * This method demostrates how we can use local and class variable together in same method
     */
    public static void method3() {
        // Class var re-assignment as needed
        classVar = "Class variable accessed in method3";
        // local variable declaration
        int method3Var = 13456;
        System.out.println("Method 2 Variable: " + method3Var);
        System.out.println("method1 class var value " + classVar);
    }
}
