package com.bootcampexcercise.module8.activity;

//Needs to be completed

import java.util.HashSet;

import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //TODO: 1 - Type code to create a set of names.
        Set set = new HashSet();
        set.add("John");
        set.add("John");
        set.add("Harry");
        set.add("Daniel");
        //Also try adding a few duplicate entries to this set.


        //TODO: 2 - Call print method to print the set passed as its parameter.
        print(set);

    }

    static void print(Set set) {
        //TODO: 3 - Type code to print this set
        //Notice the order in which elements get printed.
        System.out.println("*** Work of for loop ***");
        for (Object nameOfMyObject : set) {
            System.out.println(nameOfMyObject.toString());
        }
    }
}
