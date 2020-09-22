package com.ram.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda_List {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		
		//Conventional  way to iterate list
		System.out.println("*** Conventional  way to iterate list ***");
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("*** lambda Expression to iterate list with return type ***");
		// lambda Expression to iterate list with return type
		list.forEach((String item) -> System.out.println(item));
		
		System.out.println("*** lambda Expression to iterate list without return type ***");
		// lambda Expression to iterate list with return type
		list.forEach(item -> System.out.println(item));
		
		System.out.println("*** lambda Expression to iterate list with return type ***");
		// lambda Expression to iterate list with method reference
		list.forEach(System.out::println);
	}

}
