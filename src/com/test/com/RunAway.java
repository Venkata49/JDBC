package com.test.com;

import java.util.stream.Collectors;
public class RunAway {

	public static void main(String[] args) {
						String randomString = "resein";
						String constructedString = randomString.chars()
		                .mapToObj(c -> (char) c)
		                .filter(c -> "sreeni".contains(String.valueOf(c)))
		                .map(String::valueOf)
		                .collect(Collectors.joining());

		        System.out.println(constructedString);
		    
	}

}
