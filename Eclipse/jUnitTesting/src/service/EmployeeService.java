package service;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDao;

public class EmployeeService {

		public int add(int x, int y) {
			int sum = x+y;
			return sum;
		}
		
	public List<String> getStInfo() {
		List<String> listOfstd = new ArrayList<>();
		listOfstd.add("Raj");
		listOfstd.add("Ravi");
		listOfstd.add("Ramesh");
		return listOfstd;
	}
	
	EmployeeDao ed = new EmployeeDao();
	
	public String callDaoMethod() {
		/*
		 * 
		 * 			business logic 
		 */
		System.out.println("I Came to Service layer");
		return ed.callDaoMethodCode();
	}
}
