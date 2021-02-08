package com;
/*class Abc {
	int a;
	static int b;
	void dis1() {
		System.out.println("Non static method");
		System.out.println(a);
		System.out.println(b);
	}
	static void dis2() {
		System.out.println("Static method");
		//System.out.println(a);
		System.out.println(b);
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.a=100;
		Abc.b=200;		//static variable;
		obj1.dis1();
		Abc.dis2();    //static method
		obj1.b=30;
		obj1.dis2();
	}

}*/

class Abc {
	int a;
	static int b;
	void dis1() {
		System.out.println(a);
		System.out.println(b);
	}
	static void dis2() {
		Abc obj = new Abc();
		System.out.println(obj.a);
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Abc.dis2();
		/*Abc obj1 = new Abc();
		Abc obj2 = new Abc();
									obj1.a=10;
											Abc.b=20;
												obj1.b=30;
													obj2.a=40;
														Abc.b=50;
															obj2.b=60;
		obj1.dis1();				//a 10			b 20
		obj2.dis1();				//a		40		b	50 */
	}

}
