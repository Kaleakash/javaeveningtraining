package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		
		Employee employees[]=new Employee[100];
		
		/*Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ajay");
		emp1.setSalary(45000);
		
		System.out.println(emp1);
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object Serialization done successfully!");
		*/
		//FileInputStream fis = new FileInputStream("emp.ser");
		//ObjectInputStream ois = new ObjectInputStream(fis);
			//Object obj	 = ois.readObject();
			//Down Level Type casting 
			//System.out.println(obj);
		/*	Employee emp2 = (Employee)obj;
			System.out.println("id is "+emp2.getId());
			System.out.println("Name is "+emp2.getName());
			System.out.println("Salary is "+emp2.getSalary());*/
	}

}
