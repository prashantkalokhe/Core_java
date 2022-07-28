package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object> d = new ArrayDeque<Object> ();
		//Adding elements from front and rear end.
		d.add(11);
		d.addFirst(13);
		d.addLast("Onkar");
		//Remove elements from front and rear end.
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	}
}