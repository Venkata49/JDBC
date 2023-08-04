package com.CoreJavaSimplelearn.com;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
//		LinkedList Add() Operations..
		
		list.add("A");
		list.add("B");
		list.addLast("c");
		list.addFirst("D");
		list.add(2,"E");
		
		System.out.println(list);
		
//		LinkedList remove() Operations
		list.remove("B");
		System.out.println("remove B form list: " +list);
		
		list.remove(3);
		System.out.println("remove 3rd element from list : "+ list);
		
		list.removeLast();
		System.out.println("remove last_element from list : "+ list);
		
		list.removeFirst();
		System.out.println("remove first_element from list  :"+ list);
		
		System.out.println("final option is : "+list);
		
	}

}
