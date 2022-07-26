package com.bootcampexcercise.module3.sample;

public class StaticSample1 {


    // Attributes
    public static int SHARED = 1;  //Static attributes and methods are defined by using the keyword static
    public int notShared = 9;

    //Default Constructor
    public StaticSample1() {
    }

    public static void main(String arg[]) {   // Static methods can only directly access attributes and call methods that are also static

        //static sample
        StaticSample1 temp1 = new StaticSample1();
        StaticSample1 temp2 = new StaticSample1();
        // Initial Value Print
        System.out.println("Shared temp2 initial value " + temp2.SHARED);
        System.out.println("Shared temp1 initial value " + temp1.SHARED);
        System.out.println("Not Shared initial temp2 " + temp2.notShared);
        System.out.println("Not Shared initial temp1 " + temp1.notShared);

        // Update shared and unshared value of temp1 object and see the impact
        temp1.SHARED = 99;
        temp1.notShared = 1;

        System.out.println("Shared temp2 updated value " + temp2.SHARED);
        System.out.println("Shared temp1 updated value " + temp1.SHARED);
        System.out.println("Not Shared initial temp2 " + temp2.notShared);
        System.out.println("Not Shared updated temp1 " + temp1.notShared);

        // Update shared and unshared value of temp2 object and see the impact
        temp2.SHARED = 100;
        temp2.notShared = 2;
        System.out.println("Shared temp2 updated value " + temp2.SHARED);
        System.out.println("Shared temp1 updated value " + temp1.SHARED);
        System.out.println("Not Shared updated temp2 " + temp2.notShared);
        System.out.println("Not Shared previously updated temp1 " + temp1.notShared);

        StaticSample1.SHARED = 300; // Static members of a class can be accessed or are referenced by the class name


        System.out.println(temp1.SHARED);  // Static attributes and methods are associated to the class and are shared by all instances of the class
        System.out.println(temp1.notShared);
        System.out.println(temp2.SHARED);  // Static attributes and methods are associated to the class and are shared by all instances of the class
        System.out.println(temp2.notShared);


    }

}
