package com.CoreJavaSimplelearn.com;

public class JavaTokens {

	public static void main(String[] args) {
		
		/*Tokens are divided into 5 types there are......
		1.keywords :
		
		2. Identifers :
		
			any variable names you declare in your program
			cannot : start with number, contain space, have +,-,&
			
		3. Constants : 
			final variables
			
		4. Special Symbol :
			[] () {}, ; * * =
			
		5. Operators
			 arithmatic ,comparison, logical, bitwise etc..,*/
		
		int a = 100;
		System.out.println("int value : "+ a);
		
		long b = a;
		System.out.println("long value : "+ b);
		
		float c = a;
		System.out.println("float value : "+ c);
		
		
		
		
//		TypeCasting
		
		double a1 = 50.50;
		System.out.println("double representation : "+ a1);
		
		float f = (float)a1;
		System.out.println("float representation :"+ f);
		
		long b1 = (long) a1;
		System.out.println("long representation :"+ b1);
		
		int c1 =(int)b1;
		System.out.println("int representation :"+ c1);
		
		
		
		
		
	}

}
