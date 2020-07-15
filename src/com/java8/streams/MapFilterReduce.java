package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapFilterReduce {

	public static void main(String[] args) {
		//mapping_operation();
		//reduction_operation();
		//oldStyleIteration();
		filter_operation();
	}

	private static void filter_operation() {

		// A simple array
		String[] players = new String[] { "sam", "peter", "billy", "lilly" };
		// A stream is a sequence of elements supporting sequential and parallel
		// aggregate operations.
		Stream<String> playerStream = Arrays.stream(players);
		// Provides a subset based on a condition
		Stream<String> filteredStream = playerStream.filter(player -> player.length() > 3);
		
		
		// Converting the stream to array.
		String[] newPlayers = filteredStream.toArray(String[]::new);

		//*****************My Practise *****************//
		Stream<String> playerStream1 = Arrays.stream(players);
		// Provides a subset based on a condition
		
		playerStream1 = playerStream1.filter(player -> player != "sam");
		playerStream1 = playerStream1.filter(player -> player =="sam");
		
		// Converting the stream to array.
		String[] newPlayers1 = playerStream1.toArray(String[]::new);
		
		
		for (Object playerObject : newPlayers1) {
			System.out.println(playerObject);
		}
	}

	private static void mapping_operation() {

		String[] players = new String[] {"x","y","z","xx"};

		Stream<String> playerStream = Arrays.stream(players);

		Stream<String> upperStream = playerStream.map(player -> player.toUpperCase());

		String[] mappedPlayers = upperStream.toArray(String[] :: new);
		
		for(String string :mappedPlayers) {
			System.out.println(string);
		}

	}

	private static void oldStyleIteration() {
		ArrayList integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(6);
		integerList.add(10);
		// oldest form of iteration
//		for (int i = 0; i < integerList.size(); i++) {
//			Integer integer = (Integer) integerList.get(i);
//			System.out.println(integer);
//		}
		// enhanced for loop
//		for (Object object : integerList) {
//			Integer number = (Integer) object;
//			System.out.println(number);
//		}

// using iterator
//		Iterator<Integer> iterator = integerList.iterator();
//		// Iterate it manually
//		while (iterator.hasNext()) {
//			int value = iterator.next();
//			System.out.println(value);
//			// iterator.remove();
//		}
//		System.out.println(integerList);

		int sum = 0;
		// Find the sum of all numbers greater than 5
		Iterator<Integer> iterator = integerList.iterator();
		// Iterate it manually
		while (iterator.hasNext()) {
			int value = iterator.next();
			// check number greater than 5
			if (value > 5) {
				sum = sum + value;
			}
		}
		System.out.println(sum);

		// drawbacks
//		1. external iteration
//		2. sequential in nature 
//		3. too much code for a simple task.
	}
	
	private static void reduction_operation() {
		// traditonal way of doing the reduction operation....
		int playersSalary1[] = { 70000, 100, 20000 };
//		int sum = 0;
//		for (int i = 0; i < playersSalary1.length; i++) {
//			sum = sum + playersSalary1[i];
//		}
//		System.out.println(sum);

//A sequence of primitive int-valued elements supporting sequential and parallel aggregate operations. This is the int primitive specialization of Stream.
		IntStream playerStream = Arrays.stream(playersSalary1);
		int sum = playerStream.sum();
		System.out.println(sum);

		System.out.println(Arrays.stream(playersSalary1).max());
		System.out.println(Arrays.stream(playersSalary1).min());
		System.out.println(Arrays.stream(playersSalary1).count());
	}
}
