package com.test.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWords {

	public static void main(String[] args) {

		String input="my name is sree and my country name is india";
		List<String> uniqueWords=Arrays.stream(input.split("\\s+"))
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(uniqueWords+" ");
	}

}
