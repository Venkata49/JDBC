package com.start.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharacter {

	public static void main(String[] args) {
		String name = "Venkata kumar";
		String[] arr = name.split(" ");
		//Map<String,List<String>> map = Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		//System.out.println(map);
		Map<Object, List<String>> mawp = Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		System.out.println(mawp);
	}

}
