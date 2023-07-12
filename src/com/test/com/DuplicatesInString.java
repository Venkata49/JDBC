package com.test.com;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesInString {

	public static void main(String[] args) {
		String str="helloworld";
		        Map<Character, Long> charCounts = str.chars()
		                .mapToObj(c -> (char) c)
		                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		        System.out.println("Element counts in the string:");
		        charCounts.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		    }
}

	