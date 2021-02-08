package com;
class Book implements Runnable{
		int avl=1;
		@Override
		public synchronized void run() {
		String name = Thread.currentThread().getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
		}
}
public class BookingApp {
	public static void main(String[] args) {
	Book b1 = new Book();							//b1 = avl=1
	//Book b2 = new Book();							//b2 = avl=1
	//Book b3 = new Book();							//b3 = avl=1
	Thread t1 = new Thread(b1,"Raj");
	Thread t2 = new Thread(b1,"Ravi");
	Thread t3 = new Thread(b1,"Ramesh");
	t1.start();
	t2.start();
	t3.start();
	}

}
