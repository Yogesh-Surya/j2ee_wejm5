package com.jspider.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class StudentFetch {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id ");
		int id = sc.nextInt();
		
		String url="jdbc:mysql://localhost:3306/student?user=root&password=root";
		String query = "SELECT *FROM STUDENT WHERE ID=?";
		
		Driver driver = new Driver();   
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement =connection.prepareStatement(query);
		preparedStatement.setInt(1,id);
		
		ResultSet resultset = preparedStatement.executeQuery();
		
		while (resultset.next()) {
			System.out.println("*******************");
			System.out.println("id = " + resultset.getInt(1));
			System.out.println("name = " + resultset.getString(2));
			System.out.println("address = " + resultset.getString(3));
			System.out.println("phone =" + resultset.getLong("mobile_no"));
			System.out.println("class = " + resultset.getString(5));
			System.out.println("*******************");
		}
		
	
		connection.close();
	}

}
