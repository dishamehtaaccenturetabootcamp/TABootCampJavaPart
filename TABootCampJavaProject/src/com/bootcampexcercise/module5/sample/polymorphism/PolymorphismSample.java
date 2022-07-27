package com.bootcampexcercise.module5.sample.polymorphism;

public class PolymorphismSample {


    public static void main(String arg[]) {

        Person_P p = new Person_P();
        Student_P s = new Student_P();
		Person_P ps = new Student_P();
//		This line will give error
//		Student_P pss= new Person_P();


        s.setGrade(10);
        s.setSchool("A Fictional School");
        s.setName("Sandra Chu");
        s.setAge(15);

        // Method Overloading
        System.out.println("-------------Method Overloading----------------");
        p.address("Riga", "Rigas");
        // you will get error if you try to use child method from parent object
//		p.address("SanJose", "CA", 1234, "Pines St"); // calls address() method from the Student_P class
        s.address("SanJose", "CA");  // calls address() method from the Person_P class
        s.address("SanJose", "CA", 1234, "Pines St"); // calls address() method from the Student_P class

        // Method Overriding
        System.out.println("-------------Method Overriding----------------");
        p.announce();
        System.out.println("-----------------------------");
        s.announce();
        System.out.println("-----------------------------");
		ps.announce();


    }
}

