package com.CoreJavaSimplelearn.com;

public class Student {

//	attributes
	
	String name;
	int age;
	String address;
	
	
//	Parameteried Constructor
	
	public Student(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddress(){
		return address;
	}
	
	public static void main(String[] args){
		Student std = new Student("Venkat",23,"Dommaranandyala");
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getAddress());
	}
	


}
