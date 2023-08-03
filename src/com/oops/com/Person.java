package com.oops.com;



class Student1{
	String name;
	int age;
	public void printInfo(String name){
		System.out.println(name);
	}
	public void printInfo(int age){
		System.out.println(age);
	}
	public void printInfo(String name,int age){
		System.out.println(name+" "+ age);
	}
}
class Person{
	public static void main(String args[]){
		Student1 in = new Student1();
		in.name = "venkat";
		in.age = 23;
		in.printInfo(in.name, in.age);
		}
}
