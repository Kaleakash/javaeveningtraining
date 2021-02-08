package com;
/*class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {					// reusability 
	void color() {	
		System.out.println("Black");	
	}
}
class Pulsar extends Bike {
	void color() {
		System.out.println("Red");
	}
	void speed() {							//override 
		System.out.println("90km/hr");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Whilte");
	}
	void speed() {
		super.speed();
		System.out.println("30km/hr");					//merge 
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Honda hh= new Honda();		hh.color();hh.speed();
		Pulsar pu = new Pulsar();		pu.color();pu.speed();
		Tvs tv = new Tvs();			tv.color(); tv.speed();
	}
}
*/

class A {
	void dis1() {
		System.out.println("A class method");
	}
}
class B extends A {
		void dis1() {
			System.out.println("B class method");
		}	
		void dis2() {
			System.out.println("B class own method");
		}
}
public class DemoTest {
	public static void main(String[] args) {
		A obj = new B();
		obj.dis1();
		//obj.dis2();
		
		B obj1 = (B)obj;				//down level type casting 
		obj1.dis2();
	}
}





