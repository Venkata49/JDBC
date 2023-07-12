package com.test.com;

//Inheritance.....
		/*Defination :- Aquiring all the properties (attributes)& behavior(methods) from one class to another class 
		is called as inheritance.
		5 types of inheritance are 
		1.single
		2.multilevel
		3.hierarchical
		4.multiple
		5.hybrid
		*/
		
		


//Single Inheritance....

/*class A{//parent class...
	int a;
	 void display(){
		 System.out.println(a);
	 }
}

class B extends A{//child class....
	int b;
	void print(){
		System.out.println(b);
	}
}
public class sayHelloworld{
	public static void main(String[] args){
		A obj = new  A();
		obj.a=100;
		obj.display();
		B body = new B();
		body.a=107;
		body.b=199;
		body.display();
		body.print();
		
		
		
				
	}
	
}
*/

/*
//Multileverl inheritance....

class A{//parent class...
	int a;
	 void display(){
		 System.out.println(a);
	 }
}

class B extends A{//B is a child class of A....
	int b;
	void print(){
		System.out.println(b);
	}
}

class C extends B{//C is child class of B
	int c ;
	void show(){
		System.out.println(c);
	}
	
}
public class sayHelloworld{
	public static void main(String[] args){
		A obj = new  A();
		obj.a=100;
		obj.display();
		
		B body = new B();
		body.a=107;
		body.b=199;
		body.display();
		body.print();
		
		C obj1 = new C();
		obj1.a=33;
		obj1.b=44;
		obj1.c=55;
		obj1.display();
		obj1.print();
		obj1.show();
		
}
}*/

/*
//Hirarchical inheritance...
class parent{
	//int a;
	 void display(int a){
		 System.out.println(a);
	 }
}

class child1 extends parent{
	//int x;
	void show(int x){
		System.out.println(x);
	}
	
}

class child2 extends parent{
	//int y;
	void show(int y){
		System.out.println(y);
	}
}


public class sayHelloworld{
	public static void main(String[] args){
		child1 c1 = new child1();
//		c1.a=200;
//		c1.x=303;
//		c1.show();
//		c1.display();
		c1.show(2321);
		c1.display(5656);
		
		child2 c2 = new child2();
//		c2.a=200;
//		c2.y=303;
//		c2.show();
//		c2.display();
		c2.show(201);
		c2.display(3022);
		
	}
}

*/



//Method overriding....
//
/*import java.util.Scanner;
public class sayHelloworld{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = input.nextInt();
		if(n%2==0)
			System.out.println(n+ "n is even number");
		else if(n%2!=0)
			System.out.println(n+"n is add");
		else System.out.println("non..");
	}
}
*/








































