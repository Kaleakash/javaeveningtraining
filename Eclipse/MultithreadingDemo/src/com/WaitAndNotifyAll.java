package com;
class Abc implements Runnable {
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
	for(int i=0;i<10;i++) {
		try {
			System.out.println(name+" "+i);
					if(name.equals("Raj") && i==5) {
						wait();
					}
					if(name.equals("Ramesh") && i==4) {
						wait();
					}
					if(name.equals("Ravi") && i==6) {
						notifyAll();
					}
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
}
public class WaitAndNotifyAll {
	public static void main(String[] args) {
		Abc b1 = new Abc();
		Thread t1 = new Thread(b1,"Raj");
		Thread t2 = new Thread(b1,"Ravi");
		Thread t3 = new Thread(b1,"Ramesh");
		t1.start();
		t2.start();
		t3.start();
	}

}
