package com.oops.com;


class shape{
	public void area(){
		System.out.println("display area");
	}
}
class triangle extends shape{
	public void area(int l, int h){
		System.out.println(1/2*l*h);
	}
	
}
class equilateralTriangle extends triangle{
	public void area(int r){
		System.out.println((3.14)*r*r);
	}
}


public class Inheritancee {
	public static void main(String[] args){
		triangle t1 = new triangle();
		
		
		
	}

}
