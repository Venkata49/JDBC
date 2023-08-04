package com.CoreJavaSimplelearn.com;

public class Arrays {

	public static void main(String[] args) {
//		declare an array
		int[] anArray;
		
//		allocate memory for 10 integers
		anArray = new int[10];
		
//		initialize first element
		anArray[0] = 100;
		
//		initialize second element
		anArray[1] =  200;
		
//		same like intialize array elements
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 110;
		anArray[9] = 900;
		
		System.out.println("element at index 0 :"+ anArray[0]);
		System.out.println("element at index 1 :"+ anArray[1]);

		
		
//		Enhanced for loop
		
		int [] num = {1,2,3,4,5,6,7,7,8,9};
		for(int item : num){
			System.out.println("Count is : "+item);
		}
	
		
		
//		Nested for loop
		
		int arr[][] = {{1,2,3},{4,5,0},{9,7,6}};
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
//		Colletions in java
		
	
	}

}
