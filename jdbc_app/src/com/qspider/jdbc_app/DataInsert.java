package com.qspider.jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;



public class DataInsert {

	public static void insert() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		
		System.out.println("Enter name: ");
		String name = scanner.next();
		
		System.out.println("Enter phone number: ");
		long phone = scanner.nextLong();
		
		String url = "jdbc:mysql://localhost:3306/persondb?user=root&password=root";
		String query = "INSERT INTO PERSON VALUES(?,?,?)";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2,name);
		preparedStatement.setLong(3,phone);
		
		int count = preparedStatement.executeUpdate();
		if (count >= 1) {
			System.out.println("Inserted");
		}
		else {
			System.out.println("Not-Inserted");
		}
		connection.close();	
		
	}

}
