package com.test.com;

import java.util.Arrays;
import java.util.List;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="HelloWorld";
		List<Character> vowels=Arrays.asList('A','E','I','O','U','a','e','i','o','u');
		input.chars()
		.mapToObj(c->(char)c)
		.filter(vowels::contains)
		.forEach(System.out::println);
		//System.out.println(",......"+count);
	}

}
