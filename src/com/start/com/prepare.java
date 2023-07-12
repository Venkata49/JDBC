package com.start.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class prepare {

	public static void main(String[] args) {
		/*String str = "helloworld";
		String[] arr = str.split("");
		Map<String,List<String>> map = Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		System.out.println(map);
		
		Map<String,Long> map1 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
		
		System.out.println("------------------------------");
		List<String> list = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream()
		.filter(s->s.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		System.out.println(list);
		
*/		
		
		String[] str = {"hello","worald","programmer","starht","practice"};
		String large = Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(large);
		
		
		}
}
