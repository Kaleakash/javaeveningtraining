package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class A {}
class B {}
public class HashSetDemo {

	public static void main(String[] args) {
		//Store all type of objects 
		/*HashSet hs = new HashSet();
		int a=30;
		Integer b = new Integer(a);			// converting primitive to Integer objects 
		hs.add(b);
		hs.add(10);				//aubo-boxing : converting primitive to Object taken care 
		hs.add(20.20);
		hs.add(true);
		hs.add("Ravi");
		A obj1 = new A();
		hs.add(obj1);
		B obj2 = new B();
		hs.add(obj2);
		System.out.println(hs);*/
	//	HashSet hs = new HashSet();				unorder 
		//LinkedHashSet hs = new LinkedHashSet();			// maintain the order
		TreeSet hs = new TreeSet();								//sorted by default asc. 
		System.out.println("size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(20);
		hs.add(10);
		//hs.add("Ramesh");
		hs.add(60);
		hs.add(90);
		System.out.println(hs);
		System.out.println("size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		System.out.println("Search "+hs.contains(40));
		System.out.println("Search "+hs.contains(400));
		hs.remove(10);
		System.out.println(hs);
	}

}
