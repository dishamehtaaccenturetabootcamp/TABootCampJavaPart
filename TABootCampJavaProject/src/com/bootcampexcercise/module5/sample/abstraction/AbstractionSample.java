package com.bootcampexcercise.module5.sample.abstraction;

public class AbstractionSample {

    public static void main(String[] args) {

        // Person_A is abstract class so cannot be instantiated. Following gives error
//		 Person_A p = new Person_A();

        Person_A pE = new Employee_A();
        pE.setAge(21);
        pE.setName("Smith");

        Person_A pS = new Student_A();
        pS.setAge(15);
        pS.setName("Rita");

        Employee_A e = new Employee_A();
        e.setAge(33);
        e.setName("Raju");
        e.setSalary(80000);
        e.setTitle("Programmer");

        Student_A s = new Student_A();
        s.setAge(13);
        s.setGrade(8);
        s.setName("Henry");
        s.setSchool("ABC School");

        System.out.println("---------------------------");
        System.out.println("Employee Age          : " + pE.getAge());
        System.out.println("Employee Name         : " + pE.getName());

        System.out.println("---------------------------");
        System.out.println("Student Age           : " + pS.getAge());
        System.out.println("Student Name          : " + pS.getName());

        System.out.println("---------------------------");
        System.out.println("Employee Age          : " + e.getAge());
        System.out.println("Employee Name         : " + e.getName());
        System.out.println("Employee Salary       : " + e.getSalary());
        System.out.println("Employee Title        : " + e.getTitle());

        System.out.println("---------------------------");
        System.out.println("Student Age           : " + s.getAge());
        System.out.println("Student Name          : " + s.getName());
        System.out.println("Student Grade         : " + s.getGrade());
        System.out.println("Student School        : " + s.getSchool());


    }

}
