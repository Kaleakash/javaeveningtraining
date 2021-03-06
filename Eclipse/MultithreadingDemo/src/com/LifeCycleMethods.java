package com;
class A1 implements Runnable{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		String name = t1.getName();
		for(int i=0;i<=10;i++) {
		System.out.println(name+" "+i);
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
	}
}
class B1 implements Runnable{
@Override
public void run() {
	Thread t1 = Thread.currentThread();
	String name = t1.getName();
	for(int j=0;j<=10;j++) {
		System.out.println(name+" "+j);
		try {
			Thread.sleep(500);
		}catch (Exception e) {}
	}
}
}
public class LifeCycleMethods {
	public static void main(String[] args) throws Exception {
			A1 obj1 = new A1();
			B1 obj2 = new B1();
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			t1.setName("Bike1");
			t2.setName("Bike2");
			System.out.println("1...");
			Thread.sleep(1000);
			System.out.println("2...");
			Thread.sleep(1000);
			System.out.println("3...");
			Thread.sleep(1000);
			System.out.println("Game Start");
			//System.out.println("Demo1 thread "+t1.isAlive());
			//System.out.println("Demo2 thread "+t2.isAlive());
			t1.start();
			t2.start();
			//System.out.println("Demo1 thread "+t1.isAlive());
			//System.out.println("Demo2 thread "+t2.isAlive());
			t1.join();
			t2.join();
			System.out.println("Game End");
	}

}
