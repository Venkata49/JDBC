package com.test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tirupatamma {

	public static void main(String[] args) {
		//skip & limit
		//2nd high num
		int[] nums={4,46,444,42,245,78,97};
		List<Integer> integerList = Arrays.stream(nums).boxed()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		//System.out.println(integerList);
		
		//int[] nums={4,46,444,42,245,78,97};
		Integer secondHigh = Arrays.stream(nums).boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst().get();
		//System.out.println(secondHigh);
		
		String[] input={"java","oracle","database","angular","spirngBoot"};
		String longest=Arrays.stream(input)
				.reduce((word1,word2)-> word1.length()> word1.length() ? word1:word2).get();
				//System.out.println(longest);
		
		int[] numArr={5,55,67,65,32,22,87,9,99,90};
		List<String> Str9=Arrays.stream(numArr)
		.boxed()
		.map(s ->s+"")
		.filter(x ->x.startsWith("8"))
		.collect(Collectors.toList());
		System.out.println(Str9);
		
	}

}
