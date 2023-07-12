package com.test.com;

import java.util.HashMap;//combination of key and value is called hashmap..
import java.util.Map;


public class ProgramPractice {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//adding pairs to HashMap......
		hm.put(101, "venkat");
		hm.put(102, "sreeni");
		hm.put(103, "loya");
		hm.put(104, "");
		hm.put(106,"hello");
		System.out.println(hm);
		hm.remove(104);
		System.out.println(hm);
		//how to read pairs in hashmap...
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());
			/*m.getKey();
			m.getValue();*/
		}
		
		
	}
	
}
