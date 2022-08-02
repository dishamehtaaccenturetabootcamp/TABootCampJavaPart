package com.bootcampexcercise.module10.activity;

/**
 * @author disha.k.mehta
 * Activity2
 */
public class AbstractActivity {

    public static void main(String args[]) {

        // Reference Casting
        Person pe = new Employee("QA", "Accenture", 1000);
        pe.setAge(24);
        pe.setName("Disha");

        // Normal object creation
        Student student = new Student();
        student.setName("John");
        student.setAge(17);
        student.setSchoolName("RTU");

        // Introduce method of employee
        pe.introduce();

        // Introduce method of student
        student.introduce();

        // Output
//        My name is Disha and i am 24 years old
//        I work as QA in Accenture and my salary is 1000
//        I am study in university RTU
    }
}
