package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListWithGenerics {
public static void main(String[] args) {
		/*List ll = new ArrayList();
		ll.add(100);
		ll.add("Ramesh");
		ll.add(20.20);
		
		Object obj	 = ll.get(1);
		Integer i = (Integer)obj;
		int n = i.intValue();
		System.out.println(n);*/
		//Collection framework with Generics 
		//List<Type> ll = new ArrayList<Type>();
	//	Type all wrapper classes Integer, Float, String, Boolean or user defined class. 
		
	List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);							// auto-boxing : converting primitive to object. 
		ll.add(20);
		ll.add(30);
		ll.add(40);
		
		int n = ll.get(0);					// auto-unboxing : converting object to primitive 
		System.out.println(n);
}

public ArrayList getInfo() {
	ArrayList al =new ArrayList();
	return al;
}

public List getInfoList() {
	//List al =new ArrayList();
	List al =new LinkedList();
	//List al =new Vector();
	return al;
}
}
