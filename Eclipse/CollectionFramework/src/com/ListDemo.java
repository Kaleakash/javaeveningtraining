package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		/*Stack ss = new Stack();
			ss.push(100);
			ss.push(200);
			ss.push(300);
			ss.push(400);
			System.out.println(ss);
			System.out.println(ss.pop());
			System.out.println(ss);
			System.out.println(ss.peek());
			System.out.println(ss);
			System.out.println(ss.search(200));
			System.out.println(ss.search(3000));*/
		/*ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(1, 1000);
		System.out.println(al);
		System.out.println("using index "+al.get(1));
		al.remove(2);
		al.remove(new Integer(400));
		System.out.println(al);*/
	/*	LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(1, 1000);
		ll.addFirst(1);
		ll.addLast(2);
		System.out.println(ll);*/
		/*Vector vv = new Vector();
		vv.addElement(10);
		vv.add(20);
		System.out.println(vv);*/
		PriorityQueue pq = new PriorityQueue();
		pq.add(4);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}

}
