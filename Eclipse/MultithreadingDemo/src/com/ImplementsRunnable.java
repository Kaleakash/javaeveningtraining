package com;
class AA implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
			}
		}
}
class BB implements Runnable{
	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ImplementsRunnable {
	public static void main(String[] args) {
	Runnable obj1 = new AA();
	Runnable obj2 = new BB();
	Thread t1 = new Thread(obj1);			//t1 is a thread class reference 
	Thread t2 = new Thread(obj2);			// t2 is a thread class reference 
	t1.start();
	t2.start();
	}

}
