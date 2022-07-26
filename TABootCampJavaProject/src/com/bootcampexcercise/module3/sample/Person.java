package com.bootcampexcercise.module3.sample;

public class Person {
    //Attributes
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Behavior
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String introduce() {
        return "My name is " + name;
    }

    public String introduceWithAttributes() {
        return "My name is " + name + " and age is " + age + " and gender is " + gender;
    }
}
