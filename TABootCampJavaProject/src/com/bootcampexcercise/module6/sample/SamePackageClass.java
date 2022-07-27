package com.bootcampexcercise.module6.sample;

import com.bootcampexcercise.module6.sample.AccessModifier;
public class SamePackageClass {
    AccessModifier accessModifier = new AccessModifier();


    public void method() {

        // As the variable is private it cannot be access directly. Inorder to access them we can create public getter and setter
//    accessModifier.privatVar=67;
//    AccessModifier.privatVar=5678;

        // protect var access
        accessModifier.protectedVar = 78;

        //public var access
        accessModifier.publicInt = 7;

        // default var access
        accessModifier.defaultVar = 678;
    }
}
