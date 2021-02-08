package com;

public class Employee {
	private int id;
	private String name;
	private float salary;			// instance variable
	
	void setValue(int id, String name, float salary) {
		this.id = id;
		this.name = name;
			if(salary<0) {
				this.salary = 8000;
			}else {
				this.salary = salary;
			}
	}
	Employee() {
	System.out.println("object created");
	}
	
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}

