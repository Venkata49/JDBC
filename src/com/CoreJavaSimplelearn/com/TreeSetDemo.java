package com.CoreJavaSimplelearn.com;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet <String>();
		treeset.add("E");
		treeset.add("B");
		treeset.add("C");
		treeset.add("C");
		
		System.out.println("Treeset values :"+treeset);//Treeset values :[B, C, E]
		
	}

}
