/**
 *
 */
package com.bootcampexcercise.module2.acitivity;

/**
 * @author disha.k.mehta
 *
 */
public class MultiplicationTable {

    /**
     * @param args
     */
    public static void main(String[] args) {


        // Table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("*** Table of " + i + " ***");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "X" + j + " = " + i * j);
            }
        }

        //TODO: Table from 11 to 20

        //TODO: complete code. write for loop for int i
        for (int i = 11; i <= 20; i++) {
            System.out.println("*** Table of " + i + " ***");
            for (int j = 11; j <= 20; j++) {
                //TODO: complete code. write nested for loop for int j
                System.out.println(i + "X" + j + " = " + i * j);
            }
        }


    }

}

// Solution: Replace only first for loop i to 11 and 20 and keep j 1 to 10 only