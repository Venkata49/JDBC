package com.test.com;

import java.util.stream.Collectors;
public class RandomString {

	public static void main(String[] args) {
				  String randomString = "injghse";
			      String desiredString = "sreei";
		          String constructedString = desiredString.chars()
	                .mapToObj(c -> String.valueOf((char) c))
	                .filter(randomString::contains)
	                .collect(Collectors.joining());

	        System.out.println("Constructed String: " + constructedString);


	}

}
