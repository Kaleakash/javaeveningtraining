package testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import dao.EmployeeDao;
import service.EmployeeService;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTestMock {

	@Mock
	EmployeeDao ed;								// mock object for DAO layer 
	
	@InjectMocks									// service class want to inject DAO class object. 
	EmployeeService es;
	
	@Test
	public void testCallDaoMethod() {
		
		when(es.callDaoMethod()).thenReturn("Welcome to Mock Dao Method");   // fake result. 
		//when(es.callDaoMethod()).thenCallRealMethod();
		
		assertEquals(es.callDaoMethod(), "Welcome to Mock Dao Method");
	}

}
