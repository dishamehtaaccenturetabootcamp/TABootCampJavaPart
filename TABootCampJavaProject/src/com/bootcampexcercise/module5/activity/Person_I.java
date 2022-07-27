package com.bootcampexcercise.module5.activity;


public class Person_I {


	//Attributes
	private String name;
	private int age;
	
	//Behavior
	//TODO: write default constructor. Print 'I'm Person_I constructor'
	public Person_I() {
		this.name = "Unknown";
		this.age = 0;
		System.out.println("I'm Person_I constructor");
	}
	
	//TODO: Write parameterized constructor with variables name and age

	public Person_I(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//TODO: write getter for String name
	
	
	//TODO: write setter for String name
	

	//TODO: write getter for int age
	

	//TODO: write setter for int age
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

