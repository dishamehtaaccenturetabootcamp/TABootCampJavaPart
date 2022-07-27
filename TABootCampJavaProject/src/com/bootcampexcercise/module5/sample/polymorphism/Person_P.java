package com.bootcampexcercise.module5.sample.polymorphism;

/* Person_P class is the superclass
 * Attributes : name, age
 */
public class Person_P {

    //Attributes
    private String name;
    private int age;

    //Behavior - default constructor
    public Person_P() {
        this.name = "Unknown";
        this.age = 0;
    }

    //Behavior - parameterized constructor
    public Person_P(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter for String name
    public String getName() {
        return name;
    }

    // setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    // This method is overloaded by Student sub class
    public void address(String city, String state) {
        System.out.println("*** address() method called in class Person_P ***");
    }

    // This method is overridden in Student class
    public void announce() {
        System.out.println("I am a Person");
    }

}
