package com.test.com;

import java.util.ArrayList;

public class ArrayPre {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//how to add elements to array list...
		list.add("welcome");
		list.add(10);
		list.add(10.5);
		list.add(true);
		list.add('A');
		
		//find size of array list....
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		list.add(1,"venkat");
		System.out.println("list of vales after inserting new values: "+ list);
		list.remove(0);
		System.out.println(list);
		
		for(Object i:list){
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
