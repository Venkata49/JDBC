package com.CoreJavaSimplelearn.com;

public class NonPremitiveDataType {

	public static void main(String[] args) {
		
		
//		Premitive Datatypes
		
		char a = 'A';
		byte b = 2;
		short c = 22;
		int d = 34;
		float e = 5.42323f;
		double f = 3.445354544d;
		
		System.out.println("char :"+a);
		System.out.println("byte :"+b);
		System.out.println("short :"+c);
		System.out.println("int :"+d);
		System.out.println("float :"+e);
		System.out.println("double :"+f);
		
		
//		Non-Premitive DataTypes
		
		String str = "hello";
		System.out.println(str);
		String str1 = new String("world");
		System.out.println(str1);

		int arr[];
		arr = new int[3];
		arr[0] = 3;
		arr[1] = 5;
		arr[2] = 9;
		System.out.println(arr);
		System.out.println(arr[1]);
	}

}
