
package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		long sequentialTime = sequentialStream();
		long parallelTime = parallelStream();
		
		System.out.println("Parallel is faster by "+(parallelTime*100)/(sequentialTime)+"%");
		
		//printStream();
	}

	private static long sequentialStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}
		System.out.println("BEFORE sequential PROCESSING " + productList);
		//System.out.println("Input List ---> " + productList);

		List serialList = new ArrayList();
		long started = System.nanoTime();
		productList.stream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println(element);
			System.out.println("seq > " + Thread.currentThread().getName() +" > "+element);
			serialList.add(element);
		});
		long timeElapsed = System.nanoTime() - started;
		System.out.println("Serial List --->" + serialList);
		System.out.println("AFTER PROCESSING "+ productList);
		return timeElapsed;
	}

	private static long parallelStream() {
		// create the source list
		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}

		System.out.println("BEFORE parallel PROCESSING " + productList);
		//System.out.println("Input List ---> " + productList);

		List parallelList = new ArrayList();
		long started = System.nanoTime();
		productList.parallelStream().filter(element -> (element > 5000 && element < 10000)).forEach((element) -> {
			System.out.println(element);
			System.out.println("par > " + Thread.currentThread().getName() +" > "+element);
			parallelList.add(element);
		});
		long timeElapsed = System.nanoTime() - started;
		System.out.println("Parallel List --->" + parallelList);
		System.out.println("AFTER PROCESSING "+ productList);
		return timeElapsed;
	}

	private static long printStream() {

		List<Integer> productList = new ArrayList<Integer>();

		productList.add(1000);
		for (int i = 0; i < 100; i++) {
			int lastValue = productList.get(i);
			productList.add(lastValue + 1000);
		}

		System.out.println("BEFORE PROCESSING " + productList);
		System.out.println("Input List ---> " + productList);

		for(Integer product : productList) {
			if(product > 5000) {
				System.out.println(product);
			}
		}
		return 0;
	}

}