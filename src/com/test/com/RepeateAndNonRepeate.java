package com.test.com;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeateAndNonRepeate {

	public static void main(String[] args) {
		String [] words = {"java","sql","react","bean","sql","java","react","java","scan","sql","java"};
		
		Map<String, Long> wordCounts = Arrays.stream(words)
				.flatMap(str -> Arrays.stream(str.split(" ")))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
				
		System.out.println("Repeated words: " +
				wordCounts.entrySet().stream()
				.filter(entry -> entry.getValue() >1)
				.map(Map.Entry::getKey)
				.collect(Collectors.joining(" ")));
		
		System.out.println("Non-Repeated words: " +
				wordCounts.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.joining(" ")));
	}
}
