package com;


public class DemoTest {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Employee emp1,emp2,emp3;
		int a;
		int b=20;
		int c;
		c=40;
		new Employee().dis();
		new Employee().dis();
		//emp1.dis();
		emp1 = new Employee();
		emp1.dis();
		emp1.dis();
		
		emp1 = null;
		System.gc();      // request to JVM 
		/*
		 * Person super class 		
		 * Employee sub class   
		 * 
		 *Person p = new Employee();
		 *p.dis();
		 * 
		 */
		
	}

}
