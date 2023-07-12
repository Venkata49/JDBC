package com.start.com;

//import java.awt.List;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


 public class Instructors{
	 public static void main(String[] args){
		 //count the occurrence of each character in a string.....
		 String name = "Tirpatamma";
		/* String[] arr = name.split("");
		 Map<String,List<String>> map =  Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		 //System.out.println(map);
	
		 Map<String,Long> map1 =  Arrays.stream(name.split(""))
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 //System.out.println(map1);
			 
		 //find all duplicate elements from a given string....
		 List<String>list = Arrays.stream(name.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream()
		 .filter(s->s.getValue()>1)//here change operator like '==','>2' it will display unique elements and more than 2 repeated elements will print
		 .map(Map.Entry::getKey)
		 .collect(Collectors.toList());
		// System.out.println(list);
		 
	*/	 
		 //first non-repeating element from a string...
		 String list2 = Arrays.stream(name.split(""))
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(s->s.getValue()==2)
					 .findFirst().get().getKey();
		 System.out.println(list2);
		 
		 
		 //skip & limit()...
		/* List<String>unique = Arrays.stream(name.split(""))
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(s->s.getValue()==1)
					 .map(Map.Entry::getKey).skip(1).limit(3)
					 .collect(Collectors.toList());
		 System.out.println(unique);*/
		 
		 
		 
		 
		 //second highest number...
		/* int[] numbers = {2,3,1,42,42,23,45};
		 List<Integer>integerList = Arrays.stream(numbers).boxed()
		 .sorted(Comparator.reverseOrder())
		 .collect(Collectors.toList());
		 System.out.println(integerList);
		*/ 
		 
	/*	int[] numbers = {2,3,1,42,42,23,45};
		 Integer seconHighest = Arrays.stream(numbers).boxed()
		 .sorted(Comparator.reverseOrder())
		 .skip(1)
		 .findFirst().get();
		 System.out.println(seconHighest);
		 
	*/	 
		 /*
		 
		 //Longest String from given array...
		 String[] array = {"java",".net","springboot","angular"};
		 String longest = Arrays.stream(array).reduce((word1,word2)->word1.length()>word2.length() ? word1:word2).get();
		 System.out.println(longest);
		 
		 
		 //find all elements from array to start with 9 number...
		 
		 int[] numberr = {2,32,934,86,99,675,87,90,79};
		List<String> startwith = Arrays.stream(numberr)
		 .boxed()
		 .map(s->s+"")
		 .filter(x->x.startsWith("9"))
		 .collect(Collectors.toList());
		System.out.println(startwith);
		 
		 
		 
		 
		 
		 
		 */
		 
		 
		 
		 
	 }
 }