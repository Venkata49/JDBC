package com.test.com;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		String input="aREENI";
		Character result=input.chars()
			.mapToObj(c -> (char)c)
			.collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(entry->entry.getValue()<=1)
			.map(Map.Entry::getKey)
			.findAny()
			.orElse(null);
		System.out.println(result);
	}

}
