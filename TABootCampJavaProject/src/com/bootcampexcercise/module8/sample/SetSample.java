package com.bootcampexcercise.module8.sample;
//Needs to be completed

import java.util.HashSet;

public class SetSample {
	public static void main(String[] args) {
		//TODO: 1 - Create a new HashSet and name it monthSet
		HashSet monthSet = new HashSet();

		//TODO: 2 - Add duplicate month names in it. For eg. January can be entered twice
		System.out.println(monthSet.add("January"));
		System.out.println(monthSet.add("January"));

		monthSet.add("February");
		monthSet.add("March");
		monthSet.add("April");
		monthSet.add("May");
		monthSet.add("June");
		monthSet.add("July");
		monthSet.add("August");
		monthSet.add("September");
		monthSet.add("October");
		monthSet.add("November");
		monthSet.add("December");
		System.out.println("Output : ");
		//TODO: 3 - Iterate through the HashSet and print all the months.
		for (Object nameOfObject : monthSet) {
			System.out.println(nameOfObject.toString());
		}
		// we can also print in array form as
		System.out.println(monthSet);
		//You'd notice that duplicate names are not printed. 
	}
}
