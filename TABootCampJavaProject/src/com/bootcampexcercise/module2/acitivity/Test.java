package com.bootcampexcercise.module2.acitivity;

public class Test {
    static int arr[] =new int[10];
    public static void main(String args[]){
        createNumbersInArray(10);
        System.out.println(arr);
    }
    public static void createNumbersInArray(int count){
        for( int i=0; i<count; i++){
            double num = Math.random();
            arr[i]=((int)num);

        }
    }
}
