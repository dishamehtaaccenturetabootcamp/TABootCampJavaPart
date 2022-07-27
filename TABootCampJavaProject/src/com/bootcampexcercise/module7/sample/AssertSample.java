package com.bootcampexcercise.module7.sample;

// Needs to be completed
//Run this class with -ea option enabled in JVM arguments
// Note
// To Enable -ea right click on class workspace -> Modify run configuration ->
// Click Modify options -> Add VM Options -> write -es in field and apply
public class AssertSample {

    public static void test() {
        //1 - Type assert 5 %2 and 6%2 in separate statements
        int value = 5 % 2;
        assert 6 % 2 == 1;
        assert value == 1 : "Assertion failed";


    }

    public static void main(String arg[]) {
        //2 - Call test()
        test();


    }
}
