package com.bootcampexcercise.module5.sample;

import com.bootcampexcercise.module5.sample.polymorphism.Person_P;
import com.bootcampexcercise.module5.sample.polymorphism.Student_P;

public class ReferenceCastingSample {

    public static void main(String arg[]) {

        Student_P student = new Student_P();
        student.setName("Jane Doe");
        student.setSchool("A Fictional School");
        student.setGrade(10);
        student.setAge(21);

        // Sample reference casting
        Person_P tempPerson = new Student_P();
        tempPerson.setAge(28);
        tempPerson.setName("Arturs");// convert student to person

        System.out.println("Converted upcasting persons attributes \n name: "
                + tempPerson.getName() + "\n age: " + tempPerson.getAge());
        Student_P tempStudent = (Student_P) tempPerson; // convert person to student
        System.out.println("**********************************************");
        tempStudent.setGrade(11);

        System.out.println("Converted downcasting students attributes \n name: "
                + tempStudent.getName() +
                "\n students age: " + tempStudent.getAge()
                + "\n school: " + tempStudent.getSchool() +
                "\n grade: " + tempStudent.getGrade());
    }
}
