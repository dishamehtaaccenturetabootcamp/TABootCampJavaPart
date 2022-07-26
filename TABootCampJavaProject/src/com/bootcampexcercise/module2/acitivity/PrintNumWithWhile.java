/**
 *
 */
package com.bootcampexcercise.module2.acitivity;

/**
 * @author disha.k.mehta
 *
 */
public class PrintNumWithWhile {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Even nos from 1-100");

        // Print all even numbers less than 100
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("Odd nos from 1-100");
        //TODO: write code to Print all odd numbers less than 100
        int j = 1;
        while (j < 100) {
            System.out.println(j);
            j = j + 2;
        }

    }

}






// Solution:
// i = 1;
  //      while (i < 100) {
    //        System.out.println(i);
      //      i = i + 2;
        //}