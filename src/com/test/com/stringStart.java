package com.test.com;

import java.io.*;
public class stringStart {

	public static void main(String[] args){
		
		//This are predefined methods......
		
		/*String s1 = "welcome";
		String s2= " to java program";
		String add = s1 + s2;
		System.out.println(s1.length());//length()
		System.out.println(s1.concat(s2));//concat()
		System.out.println(add);//add
		System.out.println("another".concat("to another"));
		
		String s3 = "       Use trime() method";
		System.out.println(s3);
		System.out.println(s3.trim());//trim()->removes the spaces
		
		//charAt()
		System.out.println(s3.charAt(12));
		//contains
		System.out.println(s1.contains("me"));
		//equals() && equalsIgnoreCase()
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		//replace()
		System.out.println(s1.replace('e', 'x'));
		System.out.println(s1.replace("welcome", "xzzzz"));
		
		//substring()
		System.out.println(s1.substring(1,5));
		
		//toLowerCase() & to UpperCase()
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
*/		
		/*
		StringBuffer ab = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		ab.append(s);
		System.out.println(ab.reverse());*/
		
		
		/*String s = "reverse";
		int len = s.length();//length is 8
		String rev = " ";
		for(int i=len-1;i>=0;i--){
			rev = rev + s.charAt(i);//start with 7 6 5 4 3 2 1 0 -> it means calculate  in last element in String....
		}
		System.out.println(rev);*/
		
		String s[] = {"welcome","hello","java","python","c++"};
		String search = "hhhh";
		boolean flag = false;
		for(String i:s){
			if(i.equals(search)){
				System.out.println("string is found");
				//break;
				
				
					System.out.println("string is not found");
				
			}
			//if(flag==false)
				
		}
		
	}

}
