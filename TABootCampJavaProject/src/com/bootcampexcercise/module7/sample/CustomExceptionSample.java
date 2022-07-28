package com.bootcampexcercise.module7.sample;

// Needs to be completed
public class CustomExceptionSample {

    //static setAge(int age) which throws CustomException
    public static void setAge(int age) throws CustomException {
        //1 - Check if age<0. if yes, then throw CustomException
        {
            if (age < 0) {
                //Creating and throwing an instance of CustomException
                //this ensures that CustomException is thrown
                throw new CustomException();
            } else {
                System.out.println("Age is " + age);
            }
        }
    }

    public static void main(String arg[])  {
        //Since CustomException is a checked exception, it's mandatory to call setAge method

        //2 - call setAge method with -1 as its parameter and surround this with a try catch block
//        setAge(-8);
        // above line gives error without throws
//        try {
//            setAge(-9);
//        } catch (CustomException c) {
//            System.out.println(c.getMessage());
//            System.out.println("Catch custom exception");
//
//        }

    }
}
