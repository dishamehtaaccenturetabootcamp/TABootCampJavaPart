package com.bootcampexcercise.module2.sample;

public class MethodExample {
    public static void main(String args[]) {

        // Call static method of same class
        System.out.println(sumOf2Nos(20, 30));
        // call static method of different class
        System.out.println(MethodExample.sumOf2Nos(20,30));

        // Create object of class and call method using that object
        MethodExample methodExample = new MethodExample();
        methodExample.greet();
    }

    // Method with no return type or parameteres
    public void greet() {
        System.out.println("Greetings everyone :)");
    }

    // method with string return type
    public String returnGreetings() {
        return "Hello Everyone";
    }

    // method with int return type and int parameters
    public static int sumOf2Nos(int x, int y) {
        return (x + y);
    }

}
