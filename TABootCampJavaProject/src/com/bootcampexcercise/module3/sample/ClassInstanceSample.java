package com.bootcampexcercise.module3.sample;

public class ClassInstanceSample {

    public static void main(String arg[]) {

        //Object instance creation using 'new' and passing parameters to constructors
        Person him = new Person("John Doe");
        Person her = new Person("Jane Doe");
        Person himWithAttributes = new Person("John Doe", 25, 'M');

        //Access an object's member method to invoke a behavior
        System.out.println(him.introduce());
        System.out.println(her.introduce());
        System.out.println(himWithAttributes.introduceWithAttributes());


        // Access and Set the object's attribute using it's setter and getter
        Person b = new Person();
        b.setName("Arturs");
        b.setAge(23);
        b.setGender('M');
        String name = b.getName();
        System.out.println(name);
        System.out.println(b.introduce());
        System.out.println(b.introduceWithAttributes());

        //This will cause the object pointed by 'her' to be garbage collected
        //since there are no more remaining references to that object
        her = null;


    }
}
