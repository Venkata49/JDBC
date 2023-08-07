package com.CoreJavaSimplelearn.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsforEach {

	public static void main(String[] args) {

		List<String> language = new ArrayList<>();
		language.add("scala");
		language.add("java");
		language.add("python");
		language.add("javascript");
		
//		Sorting...
		List<String> sortList = language.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted elements are : "+ sortList);//sorted elements are : [java, javascript, python, scala]

		System.out.println("------------------------");
		
//		ForEach loop Method
		
		System.out.println("printing all elements :");
		language.stream().forEach(y-> System.out.println("element is :"+y));
		/*printing all elements :
			element is :scala
			element is :java
			element is :python
			element is :javascript

		*/
	}

}
