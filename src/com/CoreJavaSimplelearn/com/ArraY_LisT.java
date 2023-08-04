package com.CoreJavaSimplelearn.com;

import java.util.ArrayList;
import java.util.List;

public class ArraY_LisT {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(5);
		for(int i=1;i<=5;i++)
			arrayList.add(i);
		System.out.println(arrayList);//output is : [1,2,3,4,5]
		
//		Remove elements at index
		arrayList.remove(3);
		System.out.println(arrayList);//output is : [1, 2, 3, 5]
		
//		Add element
		arrayList.add(0);
		System.out.println(arrayList);//output is : [1, 2, 3, 5, 0]
		
//		Printing elements one by one
		for(int i=0; i < arrayList.size(); i++){
			System.out.print(arrayList.get(i)+" "); //output is : 1,2,3,5
		}
		System.out.println();
		
				
//		Same process for loop
		System.out.println("Another for loop process");
		for(int i : arrayList){
			System.out.println(i);
		}
		
		
	}

}
