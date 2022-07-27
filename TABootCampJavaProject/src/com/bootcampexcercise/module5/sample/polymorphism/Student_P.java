package com.bootcampexcercise.module5.sample.polymorphism;


/* Student_P class is the sub class of Person class
 * Attributes : school, grade
 */
public class Student_P extends Person_P {

    //Attributes
    private int grade;
    private String school;

    //Behavior - default constructor
    public Student_P() {

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

    // this is an example of method overloading
    public void address(String city, String state, long streetNum, String streetName) {
        System.out.println("*** address() method called in class Student_P ***");
    }

    // This method is overridden from Person class
    public void announce() {
        System.out.println("I am a Student");
    }

}
