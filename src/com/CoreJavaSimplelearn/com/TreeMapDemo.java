package com.CoreJavaSimplelearn.com;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(3, "A");
		treemap.put(2, "B");
		treemap.put(1, "D");
		treemap.put(5, "C");
		
		System.out.println(treemap);//output is : {1=D, 2=B, 3=A, 5=C}
		
		System.out.println("----------------------");
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		tree.put("B",1);
		tree.put("C",4);
		tree.put("D",2);
		tree.put("A",3);
		System.out.println(tree);//output is : {A=3, B=1, C=4, D=2}
		

		

		
	}

}
