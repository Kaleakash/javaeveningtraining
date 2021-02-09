package com;

import java.util.HashSet;
import java.util.Set;

class A1 {}
class B1 extends A1 {}
class C1 extends B1 {}
class D1 extends C1 {}
class Abc {
	void display1(Set<Integer> ss) {
		
	}
	void display2(Set<?> ss) {			// ? raw type any object Integer, Float, A1, B1, C1, D1
		
	}
	void display3(Set<? extends B1> ss) {		// ? extends className any class sub class of current class including that class. 
														// B1 class object as well as sub class of B1 class 
	}
	void display4(Set<? super B1> ss) {	//B1 class object as well as super class of B1
		
	}
}
public class GenericsWithWildCards {
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		Set<Integer> s1 = new HashSet<>();
		s1.add(10); s1.add(20); s1.add(30);
		obj1.display1(s1);
		Set<Float> s2 = new HashSet<>();
		s2.add(10.10f); s2.add(30.30f);
		obj1.display2(s2);		obj1.display2(s1);
		
		Set<String> s22 = new HashSet<>();
		s22.add("A"); s22.add("B");
		obj1.display2(s22);		obj1.display2(s22);
		
		A1 a = new A1();
		B1 b = new B1();
		C1 c = new C1();
		D1 d = new D1();
		Set<A1> s3 = new HashSet<>();	s3.add(a);
		Set<B1> s4 = new HashSet<>();	s4.add(b);
		Set<C1> s5 = new HashSet<>();	s5.add(c);
		Set<D1> s6 = new HashSet<>();	s6.add(d);
		obj1.display3(s6);
		
		obj1.display4(s3);
	}
}
