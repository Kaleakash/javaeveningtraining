package testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import service.EmployeeService;

public class EmployeeServiceTest {

	@Test
	public void testAdd() {
		EmployeeService es = new EmployeeService();
		int res = es.add(100, 200);
		assertEquals(300, res);
	}

	
	@Test
	public void testGetStInfo() {
		EmployeeService es = new EmployeeService();
		List<String> list  = es.getStInfo();
		assertEquals(3, list.size());
		assertEquals("Ramesh", list.get(2));
		
	}
}
