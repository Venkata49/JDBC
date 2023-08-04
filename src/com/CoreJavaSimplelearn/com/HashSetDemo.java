package com.CoreJavaSimplelearn.com;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> hashset = new HashSet<String>();
		
//		added elements
//		hashset not allows duplicate elements
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("C");
		hashset.add("D");
		
		System.out.println(hashset);//output is : [A, B, C, D]

		System.out.println("list contains C or not : "+ hashset.contains("C"));// output is : list contains C or not : true

		hashset.remove("A");
		System.out.println("set after removing A : "+ hashset);//output is : set after removing A : [B, C, D]
		
//		for loop 
		for(String item : hashset){
			System.out.println(item);//output is : B C D
		}
		
		
		
	}

}
