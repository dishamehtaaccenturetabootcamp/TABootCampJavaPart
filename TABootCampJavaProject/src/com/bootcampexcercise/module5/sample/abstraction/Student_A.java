package com.bootcampexcercise.module5.sample.abstraction;

public class Student_A extends Person_A {

    //Attributes
    private int grade;
    private String school;
    private String name;

    //Behavior - default constructor
    public Student_A() {
        System.out.println("I'm Student_A constructor");
    }

    // getter for int grade
    public int getGrade() {
        return grade;
    }

    // setter for int grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // getter for String school
    public String getSchool() {
        return school;
    }

    // setter for String school
    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int x = 8, y = 9;
        System.out.println("Sum of two nos is " + (x - y));
        this.name = "<S>" + name;
    }


}
