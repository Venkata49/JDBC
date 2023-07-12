package com.test.com;

public class DbmsConnect {

	public static void main(String[] args) {
		int num=4;
		int count=0;
		
		if(num>1){
			for(int i=1;i<=10;i++){
				if(num%i==0)
					count++;
				
			}
			if(count==2){
				System.out.println("Prime");
			}else{
				System.out.println("Not:");
			}
		}else{
			System.out.println("Not-Prime");
		}
	
	}

}
