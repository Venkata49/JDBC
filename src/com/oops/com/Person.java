package com.oops.com;

abstract class Person{
	abstract void calculate(double x);//abstract method without body...
	
}
class sub1 extends Person{
	void calculate(double x){//
		System.out.println("square= "+ (x*x));
	}
}
class sub2 extends Person{
	void calculate(double x){
		System.out.println("square root= "+ Math.sqrt(x));
	}
}
class sub3 extends Person{
	void calculate(double x){
		System.out.println("cube = "+ (x*x*x));
	}
}