package com.java8.newfeatures;


public class CustomFunctionalInterface {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Counter counter = Utils::countElements;
		System.out.println(counter.count(intArray));
		
		Utils objUtil = new Utils();
		Counter counterInstance = objUtil::countElementsInstance;
		System.out.println(counterInstance.count(intArray));
	}

}


@FunctionalInterface
interface Counter{
	int count(Object[] objArray); //by default its an abstract method
}

class Utils{

	public static int countElements(Object[] array) {
		return array.length;
	}
	
	public int countElementsInstance(Object[] array) {
		return array.length;
	}



}