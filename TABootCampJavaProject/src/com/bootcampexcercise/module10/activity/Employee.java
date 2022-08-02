package com.bootcampexcercise.module10.activity;

import com.bootcampexcercise.module10.activity.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author disha.k.mehta
 * Activity 2
 * Activity 4
 */
public class Employee extends Person {
    private String jobTitle;
    private String companyName;
    public int salary;

    // Constructor
    public Employee(String jobTitle, String companyName, int salary) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
    }

    // getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // override abstract class methods
    public void introduce() {
        System.out.println("My name is " + super.getName() + " and i am " + super.getAge() + " years old");
        System.out.println("I work as " + getJobTitle() + " in " + getCompanyName() + " and my salary is " + getSalary());
    }

    // Activity 4 part

    /**
     * @param {Employee} list
     * @return {String} name of highest paid employee
     * @purpose to return highest paid employee
     */
    public String getHighestPaidEmployee(List<Employee> list) {

        int size = list.size();
        String tempName = "";
        int tempSal = 0;
        for (int i = 0; i < size; i++) {
            if (list.get(i).salary > tempSal) {
                tempSal = list.get(i).salary;
                tempName = list.get(i).getName();
            }
        }
        return tempName;
    }
}
