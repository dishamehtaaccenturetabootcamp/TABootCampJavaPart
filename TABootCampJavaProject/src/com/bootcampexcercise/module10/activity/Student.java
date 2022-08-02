package com.bootcampexcercise.module10.activity;

import com.bootcampexcercise.module10.activity.Person;

/**
 * @author disha.k.mehta
 * Activity 2
 */
public class Student extends Person {

    // Attribute
    private String schoolName;

    // getters and setters
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // override introduce method with custom implementation
    public void introduce() {
        System.out.println("I study in university " + getSchoolName());
    }
}
