package com.CoreJavaSimplelearn.com;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("venkat", 10);//map.put(key, value)
		map.put("kumar", 20);
		map.put("sreeni", 30);
		System.out.println("size of the hashmap :"+map.size()); //size of the hashmap :3
		System.out.println(map);  //{venkat=10, sreeni=30, kumar=20}
		
		if(map.containsKey("venkat")){
			Integer a = map.get("venkat");
			System.out.println("value for key :" + a);
			
		}
		System.out.println("________________________");
		
		for(String key : map.keySet()){
			System.out.println("key :"+ key +", value: "+ map.get(key));
		}
		
		
		System.out.println("______________________");
		for(Entry<String, Integer>entry : map.entrySet()){
			System.out.println("key " + entry.getKey()+" vlaue " + entry.getValue());
		}
	}

}
