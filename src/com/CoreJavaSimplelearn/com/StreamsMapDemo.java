package com.CoreJavaSimplelearn.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapDemo {

	public static void main(String[] args) {
			
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);

//		List
		List<Integer> squares = new ArrayList<>();
		for(Integer j : numList){
			squares.add(j*j);
		}
		System.out.println("squares are : "+ squares);//squares are : [100, 400, 900, 1600]
		
		List<Integer> squareList = numList.stream()
									.map(x -> x*x)
									.collect(Collectors.toList());
		System.out.println("list of all squares are :"+ squareList);//list of all squares are :[100, 400, 900, 1600]
		
		System.out.println("---------------------------");
		
//		Sets 
		
		Set<Integer> squreSet = new HashSet<>();
		for(Integer i : numList){
			squreSet.add(i*i);
					
		}
		System.out.println("squares set is:"+ squreSet);//output is : [400, 1600, 100, 900]

		
		Set<Integer> squreSet1 = numList.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("Set of all squares is : "+squreSet1 );//Set of all squares is : [400, 1600, 100, 900]

		
//		Streams Filter
		
		System.out.println("---------------------------");
		
		List<String> languages = new ArrayList<>();
		languages.add("java");
		languages.add("python");
		languages.add("c++");
		languages.add("Html");
		
		List<String> filterResult = new ArrayList<>();
		for(String i : languages){
			if(i.startsWith("p")){
				filterResult.add(i);
			}
		}
		System.out.println("Starting letter is :"+ filterResult);//Starting letter is :[python]

		
//		Using filer method
		
		List<String> result = languages.stream().filter(s->s.startsWith("c"))
										.collect(Collectors.toList());
		System.out.println("Starting letter with c:"+result);//Starting letter with c: [c++]

				

	}

}
