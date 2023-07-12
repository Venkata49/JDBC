package com.test.com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueWord {

	public static void main(String[] args) {
	/*String ran="seiren";
	String org="sreeni";
	String output=org.chars()
			.mapToObj(c -> String.valueOf((char)c))
			.filter(ran::contains)
			.collect(Collectors.joining());
		System.out.println(output+"+++++++++++++++");*/
		String random="helldlowor";
		String org="helloworld";
		String out=org.chars()
				.mapToObj(c -> String.valueOf((char)c))
				.filter(random::contains)
				.collect(Collectors.joining());
		System.out.println("output string: "+out);
	}

}
