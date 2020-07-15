package com.java8.newfeatures;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalDemo {
	static String testString; //the default constructor assigns the value to null

	public static void main(String[] args) {
		Person person = null;
		ArrayList arrayList = null;
		Integer numbers[] = null;

		if (Math.random() > 0.5) {
			numbers = new Integer[3];
			numbers[0] = 100;
			numbers[1]=2;
			testString = "Welcome";
			person = new Person();
			arrayList = new ArrayList();
			arrayList.add("smile");
			arrayList.add("null");
		}

		Optional optionalCheck = Optional.ofNullable(testString);
		if(optionalCheck.isPresent()) {
			System.out.println("Its not null");
		}else {
			System.out.println("Its null");
		}
		
		optionalCheck = Optional.ofNullable(arrayList);
		if(optionalCheck.isPresent()) {
			System.out.println("Its not null");
		}else {
			System.out.println("Its null");
		}

		optionalCheck = Optional.ofNullable(numbers);
		if(optionalCheck.isPresent()) {
			System.out.println("Its not null");
		}else {
			System.out.println("Its null");
		}
		
	}
}

class Person {
	private String name = "Tester";

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}