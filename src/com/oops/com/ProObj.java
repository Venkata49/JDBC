package com.oops.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ProObj {
	private String name;
	private int age;
	
	public void accept() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name is : ");
		name = br.readLine();
		
		System.out.println("Enter age :");
		age = Integer.parseInt(br.readLine());
		
	}
	 void check(){
		if (age<=30)
			System.out.println(name + " is young");
		else if(age<=50)
			System.out.println(name + "is middle age");
		else
			System.out.println(name + "is old");
	}

}
