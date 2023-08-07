package com.CoreJavaSimplelearn.com;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();
		numList.add(21);
		numList.add(32);
		numList.add(43);
		numList.add(64);

		int sum = numList.stream().reduce(0,(ans,i)->ans+i);
		System.out.println("sum of elements :"+sum);//sum of elements :160

	}

}
