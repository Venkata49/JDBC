package com.CoreJavaSimplelearn.com;

import java.util.Stack;

public class SteckDemo {

	public static void main(String[] args) {
			Stack<String> stak = new Stack<String>();
			
			stak.push("america");
			stak.push("germany");
			stak.push("india");
			System.out.println(stak);//output is : [america, germany, india]
			
			System.out.println("------------------------------");

			String popElement = stak.pop();
			System.out.println("popElement is : "+ popElement);//output is : popElement is : india
			
			System.out.println(stak);//output is : [america, germany]
			
			System.out.println("------------------------------");
			String peekElement = stak.peek();
			System.out.println("peekElement is :"+peekElement);//output is : peekElement is :germany
			System.out.println(stak);


			

			
			
			
	}

}
