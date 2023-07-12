package com.oops.com;

import java.util.HashSet;
import java.util.Iterator;

class Person{
	public static void main(String args[]){
		HashSet<String> hs = new HashSet<String>();
		hs.add("india");
		hs.add("america");
		hs.add("japan");
		hs.add("chain");
		
		System.out.println("hashset = "+hs);
		Iterator it = hs.iterator();
		System.out.println("elements using iterator :");
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}
	
}