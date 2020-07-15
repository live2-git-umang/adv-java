package com.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
	
		List<String> list = Arrays.asList("java","sql","100","50");
		Collections.sort(list);
		System.out.println(list);
		
		//Custom sorting
		Comparator<String> comparatorLambda = (string1, string2) -> Integer.compare(string1.length(),string2.length());
		Collections.sort(list,comparatorLambda);
		System.out.println(list);
		
		Collections.sort(list,(string1,string2) -> Integer.compare(string2.length(), string1.length()));
		System.out.println(list);
		
		Collections.sort(list,(string2,string1) -> Integer.compare(string2.length(), string1.length()));
		System.out.println(list);
	}
	
	
}
