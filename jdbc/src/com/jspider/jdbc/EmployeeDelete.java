package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	 
	 Statement statement = connection.createStatement();
	 
	 int result = statement.executeUpdate("DELETE FROM EMP WHERE EMPID=3");
	 
	 if (result == 1) {
		 System.out.println("data deleted successfully");
		
	} else {
		System.out.println("data is not deleted");

	}
	 connection.close();
	 
	}

}
