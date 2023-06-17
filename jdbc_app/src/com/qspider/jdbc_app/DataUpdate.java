package com.qspider.jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DataUpdate {

	public static void update() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		
		System.out.println("Enter name: ");
		String name = scanner.next();
		
		System.out.println("Enter phone number: ");
		long phone = scanner.nextLong();
		
		String url = "jdbc:mysql://localhost:3306/persondb?user=root&password=root";
		String query = "UPDATE PERSON SET NAME=?, PHONE=? WHERE ID=?";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		preparedStatement.setString(1,name);
		preparedStatement.setLong(2,phone);
		preparedStatement.setInt(3,id);
		
		int count = preparedStatement.executeUpdate();
		if (count == 1) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not-Updated");
		}
		connection.close();	
		
	}

}
