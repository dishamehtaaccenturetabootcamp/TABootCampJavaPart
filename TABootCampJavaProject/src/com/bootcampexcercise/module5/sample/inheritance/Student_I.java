package com.bootcampexcercise.module5.sample.inheritance;

/* Student_I class is the sub class of Person class
 * Attributes : school, grade
 */
public class Student_I extends Person_I {

    //Attributes
    private int grade;
    private String school;

    //Behavior - default constructor
    public Student_I() {
        System.out.println("I'm Student_I constructor");
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

    public void announce() {
        super.announce();  // calls announce() method of Person class
        System.out.println("Inside Student Class");
    }

}
