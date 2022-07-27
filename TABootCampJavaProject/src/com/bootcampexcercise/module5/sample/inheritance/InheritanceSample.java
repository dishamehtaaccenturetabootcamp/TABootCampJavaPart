package com.bootcampexcercise.module5.sample.inheritance;

public class InheritanceSample {


    public static void main(String arg[]) {

        Person_I p = new Person_I();
        p.setName("John Doe");
        p.setAge(18);

        System.out.println("-----------------------------");
        //Student_I inherit the methods and behavior from the Person_I class
        Student_I student = new Student_I(); // Notice that Student_I constructor calls Person_I constructor
        student.setGrade(10);
        student.setSchool("A Fictional School");
        student.surname = "Mehta";

        //notice that setName method is defined in Person_I class
        //and is not defined in Student_I class. Since Student_I class is the
        //subclass of Person_I Class every public and protected fields and methods
        //of Person_I Class are automatically inherited.
        student.setName("Sandra Chu");
        student.setAge(15);


        // Print Info using Student_I object
        System.out.println("-----------------------------");
        System.out.println("Student's Name is   : " + student.getName());
        System.out.println("Student's Age is    : " + student.getAge());
        System.out.println("Student's Grade is  : " + student.getGrade());
        System.out.println("Student's School is : " + student.getSchool());
        System.out.println("Student's Surname is : " + student.surname);


        // Print Info using Person_I object
        System.out.println("-----------------------------");
        System.out.println("Person's Name is    : " + p.getName());
        System.out.println("Person's Age is     : " + p.getAge());

        // Following will give compilation error as Person_I is a superclass and cannot access
        // methods from the subclass
//        System.out.println("Person's Grade is   : " + p.getGrade());
//        System.out.println("Person's School is  : " + p.getSchool());


        // Compilation error if Person's attribute is access directly
        // since it is marked as private.
        // Attribute with private modifier is not visible to subclasses
        // It can be accessed through it's getter and setter

        // Usage of 'super'
        System.out.println("-----------------------------");
        student.announce();

    }
}
