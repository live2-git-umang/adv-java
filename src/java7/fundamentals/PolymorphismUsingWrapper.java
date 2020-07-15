package java7.fundamentals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PolymorphismUsingWrapper {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		hashMap();
		//primitiveTypes();
	}


	private static void hashMap() {

		int i = 100;
		float f = 500.50f;
		char c = 'a';

		HashMap hMap = new HashMap();
		hMap.put("Integer", new Integer(i));
		hMap.put("Float",new Float(f));
		hMap.put("Char", new Character(c));
		

		System.out.println(hMap);		
	}

	private static void primitiveTypesInCollections() {

		int i = 100;
		float f = 500.50f;
		char c = 'a';

		List list = new ArrayList();
		list.add(i);
		list.add(f);
		list.add(c);

		System.out.println(list);

	}


	private static void primitiveTypes() {

		int i = 100;
		float f = 500.50f;
		char c = 'a';

		Object object[] = new Object[3];
		//object[0] = numbers;
		//object[1] = new TestClass();

		object[0] = new Integer(i);
		object[1] = new Float(f);
		object[2] = new Character(c);


		for (Object objObject : object) {
			System.out.println(objObject);
		}
	}

}
