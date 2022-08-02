package com.bootcampexcercise.module10.activity;

/**
 * @author disha.k.mehta
 * Activity 6
 */
public class InterfaceActivity {

    public static void main(String args[]) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}

//Output
//        Bike started
//        Bike stopped
//        Car started
//        Car stopped
