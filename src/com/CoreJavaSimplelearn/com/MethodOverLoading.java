package com.CoreJavaSimplelearn.com;

public class MethodOverLoading {
	
	public int multiply(int x, int y){
		return (x*y);
	}
	
	public int multiply(int x, int y, int z){
		return (x*y*z);
	}
	public double multiply(double x, double y){
		return (x*y);
	}


	public static void main(String[] args){
		MethodOverLoading men = new MethodOverLoading();
		
		System.out.println(men.multiply(10, 20));
		System.out.println(men.multiply(10, 20,02));
		System.out.println(men.multiply(10.21, 20));
	}
	
}