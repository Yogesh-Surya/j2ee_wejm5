package com.qspider.jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;



public class DataDelete {

	public static void delete() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id: ");
		int id = scanner.nextInt();
		
		String url = "jdbc:mysql://localhost:3306/persondb?user=root&password=root";
		String query = "DELETE FROM PERSON WHERE ID=?";
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		Connection connection = DriverManager.getConnection(url);
		PreparedStatement preparedStatement =  connection.prepareStatement(query);
		
		preparedStatement.setInt(1,id);
		
		int count = preparedStatement.executeUpdate();
		if (count >= 1) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Not-Deleted");
		}
		connection.close();	
		
	}

}
