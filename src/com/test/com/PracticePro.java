package com.test.com;

public class PracticePro {
	/*int a,b;//class variables or instance variables or global variables
	void add(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	PracticePro(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void display(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum of a and b :" + (a+b));
	}
	
	public static void main(String[] args){
		PracticePro the = new PracticePro();
		the.add(20,30);
		the.display();
		
			}*/
	//Call by value.....
	/*int x;
	public void addition (int a){
		x = a*5;
	System.out.println(x);
		
	}
	public static void main(String[] args){
		PracticePro th= new PracticePro();
		th.addition(20);
		System.out.println(th.x);
	*///}
	
	
	
	//Call by reference....
	/*int x;
	public void addition(PracticePro a){//to pass a object to a method as parameter....here
		x=a.x+5;
		System.out.println(x);
	}
	public static void main(String[] args){
		PracticePro th= new PracticePro();
		th.x=10;
		th.addition(th);
		System.out.println(th.x);//here aslo we print a value....
	}
	*/
	
	
	
	//static keyword
	//static methods & static variables
	//1)static method can access only static stuff(static variables and static methods)-direct
	//2)static method can also access non-static stuff but through objects
	//3)non static methods can access every thing directly
	/*static int a = 10; //static variable...
	int b=20;//non static variable...
	
	static void m1(){
		System.out.println("static  method m1...");
	}
	void m2(){
		System.out.println("non static method...");
		
	}
	
	void m3(){
		System.out.println("------------");
		System.out.println(a);//static
		System.out.println(b);//non-static
		m1();//static
		m2();//non-static
	}
	
	public static void main (String[] args){
		System.out.println(a);
		m1();
		//m2();//it's(m2) not static method so it display error
		
		PracticePro  th=new PracticePro();
		System.out.println(th.b);
		th.m2();
		th.m3();*/
	//}
	
}
	

