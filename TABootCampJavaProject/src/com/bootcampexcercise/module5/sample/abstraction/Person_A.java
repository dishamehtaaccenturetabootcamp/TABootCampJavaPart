package com.bootcampexcercise.module5.sample.abstraction;

public abstract class Person_A {

    // default constructor
    public Person_A() {
        System.out.println("I am a Person_A Constructor");
    }

    private int age;

    // getter and setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //abstract methods have no implementation
    public abstract String getName();

    public abstract void setName(String name);


}
