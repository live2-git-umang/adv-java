package com.java8.newfeatures;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		functionalInterface();
		
	}

	private static void functionalInterface() {
		List<String> namesList = new ArrayList<String>();
		namesList.add("x");
		namesList.add("y");
		
		//@FunctionalInterface
		//public interface Consume<T>
		// accept(T t)
		/*
		 * Void accept(String item) { System.out.println(item); }
		 */
		
		namesList.forEach(item -> System.out.println(item));
		
		namesList.forEach(item -> {
			if(item.length() > 4) {
				System.out.println("Value of item "+item);
			}
		});
		
		//println is the instance method of the out object
		namesList.forEach(System.out::println);
	}
}
