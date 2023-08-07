package com.CoreJavaSimplelearn.com;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("india");
		queue.add("america");
		queue.add("japan");
		queue.add("germany");
		System.out.println(queue);//output is : [america, germany, japan, india]
		queue.remove();//output is : [germany, india, japan]
		System.out.println(queue);

		System.out.println("------------------------------");
		String head = queue.peek();
		System.out.println("peek method:"+head);//output is : germany
		
		System.out.println("--------------------------------");
		head = queue.poll();
		System.out.println(head);//output is : germany
		
		System.out.println(queue);//output is : [india, japan]

	}

}
