package com.oops.com;

class pen{
	String color;
	String type;
	
	public void write(){
		System.out.println("write something....");
	}
	public void printColor(){
		System.out.println(this.color);// this is a keyword used to access color declared value
	}
}


class Student{
	String name;
	int age;
	
	public void printName(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(){
		System.out.println("Constructor stay...");
	}

	Student(String name, int age){
		this.name = name;
		this.age = age;
		
	}


}

	



public class Demo{
	public static void main(String[] args){
		// Objects....
		/*pen p = new pen();
		p.color = "blue";
		p.type = "gel";
		pen p1 = new pen();
		p1.color = "blue";
		p1.type = "gel";
		p.write();
		p1.printColor();
		p1.printColor();*/
		
		
		Student info = new Student();
		info.name = "venkat";
		info.age =23;
		
		Student infoo = new Student("Lakshmi",20);
		info.printName();
		infoo.printName();
	}
}
	
	