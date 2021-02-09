package com;

import java.util.Scanner;

import bean.Employee;
import dao.EmployeeDao;

public class DemoTest {

	public static void main(String[] args) {
		EmployeeDao ed = new EmployeeDao();
		//ed.storeEmployee();
		/*Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = obj.nextInt();
		System.out.println("Enter the name");
		String name = obj.next();
		System.out.println("Enter the salary");
		float salary = obj.nextFloat();
		Employee emp = new Employee();
		emp.setEmpId(id);
		emp.setName(name);
		emp.setSalary(salary);
		
		ed.storeEmployee(emp);*/
		ed.retireveAllRecords();
	}

}
