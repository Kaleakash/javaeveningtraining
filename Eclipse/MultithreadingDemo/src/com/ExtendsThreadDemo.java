package com;
class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i ="+i);
		}
	}
}
class B extends Thread{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j ="+j);
		}
	}
	
}
public class ExtendsThreadDemo {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();				// instance created..
		obj1.start();
		obj2.start();					// ready to run Runnable state 
	}

}
