package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.xdevapi.PreparableStatement;

import bean.Employee;

public class EmployeeDao {

	public void storeEmployee() {
			try {
					//Class.forName("com.mysql.cj.jdbc.Driver");	
					System.out.println("Driver Loaded successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "root");
					System.out.println("Connected successfully");
					Statement stmt = con.createStatement();
					int res = stmt.executeUpdate("insert into employee values(101,'Ravi',12000)");
					if(res>0) {
						System.out.println("record inserted successfully...");
					}
					stmt.close();
					con.close();
			} catch (Exception e) {
					System.out.println(e);
			}
		}
	
	public void storeEmployee(Employee emp) {
		try {
				//Class.forName("com.mysql.cj.jdbc.Driver");	
				System.out.println("Driver Loaded successfully");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "root");
				System.out.println("Connected successfully");
				PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
				pstmt.setInt(1, emp.getEmpId());
				pstmt.setString(2, emp.getName());
				pstmt.setFloat(3, emp.getSalary());
				int res = pstmt.executeUpdate();
				if(res>0) {
					System.out.println("record inserted successfully...");
				}
				pstmt.close();
				con.close();
		} catch (Exception e) {
				System.out.println(e);
		}
	}
	
	public void retireveAllRecords() {
		try {
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "root");
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs	 = pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+"Salary is "+rs.getFloat(3));
		}
		pstmt.close();
			con.close();
	} catch (Exception e) {
			System.out.println(e);
	}
	}
	
}
