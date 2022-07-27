package com.bootcampexcercise.module6.activity;

import com.bootcampexcercise.module6.sample.AccessModifier;

public class DifferentPackageClass extends AccessModifier {

    AccessModifier accessModifier = new AccessModifier();


    public void method() {

        // As the variable is private it cannot be access directly. Inorder to access them we can create public getter and setter
//    accessModifier.privatVar=67;
//    AccessModifier.privatVar=5678;

        // protect var access
        protectedVar = 78;
        // this will give error
//        accessModifier.protectedVar=89;

        //public var access
        accessModifier.publicInt = 7;

        // default var access
        // This will give error
//        accessModifier.defaultVar = 678;
//        super.defaultVar
    }
}
