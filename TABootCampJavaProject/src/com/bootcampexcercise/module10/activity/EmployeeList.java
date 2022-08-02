package com.bootcampexcercise.module10.activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author disha.k.mehta
 * Activity 4
 */
public class EmployeeList {

    public static void main(String args[]) {

        Employee employee1 = new Employee("QA", "Accenture", 1000);
        employee1.setAge(23);
        employee1.setName("Disha");

        Employee employee2 = new Employee("JAVA Dev", "Accenture", 1020);
        employee2.setAge(35);
        employee2.setName("John");

        Employee employee3 = new Employee("FrontEnd Dev", "Infosys", 1450);
        employee3.setAge(28);
        employee3.setName("Daniel");

        Employee employee4 = new Employee("Project Manager", "Google", 2000);
        employee4.setAge(28);
        employee4.setName("Emma");


        List<Employee> list = new ArrayList<Employee>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);

        System.out.println("The Employee whose salary is the highest is " + employee1.getHighestPaidEmployee(list));


    }
}
