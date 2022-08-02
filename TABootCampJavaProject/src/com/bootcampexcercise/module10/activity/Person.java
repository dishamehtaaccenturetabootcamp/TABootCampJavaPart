package com.bootcampexcercise.module10.activity;

/**
 * @author disha.k.mehta
 * Activity 1
 */
public abstract class Person {

    // Attributes
    private String name;
    private int age;

    // getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void introduce();
}
