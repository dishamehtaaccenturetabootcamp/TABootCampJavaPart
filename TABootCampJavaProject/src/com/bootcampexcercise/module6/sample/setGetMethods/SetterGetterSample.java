package com.bootcampexcercise.module6.sample.setGetMethods;


public class SetterGetterSample {

    public static void main(String arg[]) {

        //With exposed implementation, an object can have values passed to it
        //that may be contrary to it's design

        PersonSampleOne p1 = new PersonSampleOne();
        p1.name = null;
        p1.age = -1000;

        //Will not allow improper fields to be set by throwing an exception because of setter method
        PersonSampleTwo p2 = new PersonSampleTwo("John Doe", 10);

        System.out.println("Person 1 attributes\n" + "name: " + p1.name + "\nage: " + p1.age);
        System.out.println("\nPerson 2 attributes\n" + "name:" + p2.getName() + "\nage: " + p2.getAge());
    }
}
