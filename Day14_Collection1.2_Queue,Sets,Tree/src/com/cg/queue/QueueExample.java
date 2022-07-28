package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		//PriorityQueue will insert the elements based on its priority.
		
		Queue<Object> q = new PriorityQueue<Object> ();
		q.offer(11);
		q.add(12);
		q.add(10);
		q.add(17);
		System.out.println(q);
		System.out.println(q.peek());
		//ArrayDeque will insert the elements in the same insertion order.
		
		Queue<Object> q1 = new ArrayDeque<Object> ();
		q1.offer(14);
		q1.add(21);
		q1.add(20);
		q1.add(15);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
	}
}