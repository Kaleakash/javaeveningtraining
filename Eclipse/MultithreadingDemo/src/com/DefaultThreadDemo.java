package com;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setPriority(4);
		t.setName("My Thread");
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}

}
