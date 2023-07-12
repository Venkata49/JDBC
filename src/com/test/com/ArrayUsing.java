package com.test.com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayUsing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=sc.next();
		String rev="";
		String orgStr=str;
		int len=str.length();
		
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		if(orgStr.equals(rev)){
			System.out.println("Given String is Palindrome.");
		}else{
			System.out.println("Given String is not-Palindrome");
		}
	
	}
}


