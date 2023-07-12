package com.test.com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="ENGINEER";
		
		Character result=input.chars()
				.mapToObj(c ->(char)c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
			System.out.println("First non-repeated character : " +result);
	}

}
