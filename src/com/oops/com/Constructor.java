package com.oops.com;

import java.io.*;
class Constructor {

	
		
	/*
		A Constructor is similar to a method that is used to initialize the instance variables. The sole of a constructor
		is to initialize the instance variable....
		
		* the constructor's name and class name should be same. and the constructor's name should end with a pair of simple
		  braces.
		  Example :- Person()
		  				{
		  				  }
		  				  
		* A constructor  may have may not have parameters. paramaters are variables to receive data from outside into the 
		  constructor.
		  1.If a constructor does not any parameters,it is called 'default constructor'.
		  		Example :- Person()
		  				{
		  				  }
		  				  
		  	Here default constructor is called
		  			Ex:- Person raju = new Person();
		  		
		  2.If a constructor has 1 or more parameters , it is called 'parameterized constructor'. 
		  		Example :- Person( String s, int i)
		  				{
		  				  }
				Here default constructor is called
		  			Ex:- Person raju = new Person();
		  				  				  
	*/
		
	public class Constructor{
		public static void main(String[] args){
			
		}
	}
		// instance variables(instance variables declare only class )
		Private String name;
		Private int age;
		
		//Default constructor....
		Constructor(){
			name = "venkata";
			age = 23;
		}
		
		//Parameterized constructor...
		 Constructor(String s, int i){
			name = s;
			age = i;
		}
		
		void talk(){
			
			System.out.println("hello i am "+ name);
			System.out.println("my age "+ age);
		}
	}


