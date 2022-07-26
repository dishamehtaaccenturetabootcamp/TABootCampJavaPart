package com.bootcampexcercise.module2.acitivity;

import com.bootcampexcercise.module2.sample.MethodExample;

public class NumToWordsWithMethodCalling {
    public static void main(String args[]) {

        // Call method here
        numToWordsLogic(5);
        // call method with object of previously created class
        NumToWords numToWords=new NumToWords();
        numToWords.switchCaseEx(6);
    }

    public static void numToWordsLogic(int x) {
        //logic of numToWords Class
        switch (x) {
            case 1: {
                System.out.println("ONE");
                break;
            }
            case 2: {
                System.out.println("TWO");
                break;
            }
            case 3: {
                System.out.println("THREE");
                break;
            }
            case 4: {
                System.out.println("FOUR");
                break;
            }
            case 5: {
                System.out.println("FIVE");
                break;
            }
            case 6: {
                System.out.println("SIX");
                break;
            }
            case 7: {
                System.out.println("SEVEN");
                break;
            }
            case 8: {
                System.out.println("EIGHT");
                break;
            }
            case 9: {
                System.out.println("NINE");
                break;
            }
            case 10: {
                System.out.println("TEN");
                break;
            }
            default: {
                System.out.println("Given value is not in the range 1-10");
            }
        }
    }
}
