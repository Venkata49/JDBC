package com.test.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SampleTest {

	public static void main(String[] args) {

		List<Integer> input=Arrays.asList(1,22,2,23,33,45,54,46,4,2,8);
		List<Integer> evenCount=input.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		System.out.println("Even Count ..:"+evenCount);
			
		
	}
}
