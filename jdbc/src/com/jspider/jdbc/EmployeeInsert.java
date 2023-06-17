package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class EmployeeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		1.load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2.Establish connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		
//		3.Create statement
		Statement statement = connection.createStatement();

//		4.Exucute statement
		int result = statement.executeUpdate("INSERT INTO EMP VALUES(3,'NAVI',1234567890,'PUNE'),(4,'NAVIN',1234567890,'PUNE')");
			if (result > 0) {
				System.out.println("Data inserted into table");
			} 
			else {
				System.out.println("Data is not inserted into table ");
			}
			connection.close();

	}

}
