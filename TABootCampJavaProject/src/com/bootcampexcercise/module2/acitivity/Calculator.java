/**
 *
 */
package com.bootcampexcercise.module2.acitivity;

/**
 * @author disha.k.mehta
 */
public class Calculator {

    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));

    }


    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        //TODO implement subtraction
        int diff = x - y;
        return diff;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;

    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            //TODO complete/write the code so message is printed that dividing 0 with 0 is not possible
            System.out.println("that dividing 0 with 0 is not possible");

        } else if (y == 0) {
            //TODO complete the code so message is printed that division by 0 is not possible
            System.out.println("that dividing with 0 is not possible");
        } else {
            //TODO complete the code so that division is done
            divValue = x / y;
        }
        return divValue;
    }

}

